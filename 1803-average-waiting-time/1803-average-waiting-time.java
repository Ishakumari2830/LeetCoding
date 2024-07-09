class Solution {
    public double averageWaitingTime(int[][] customers) {
       double totwt =0;
       int tottime = 0;
       for(int[] arr: customers){
        int arrT = arr[0];
        int prepT = arr[1];
       
       tottime = Math.max(tottime, arrT)+prepT;
       int wt = tottime-arrT;
       totwt +=wt;
       }
       return totwt/customers.length;
    }
}