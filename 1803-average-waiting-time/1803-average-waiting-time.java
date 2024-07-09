class Solution {
    public double averageWaitingTime(int[][] customers) {
       double totwt =0;
       int tottime = 0;
       for(int[] arr: customers){
        int arrT = arr[0];
        int prepT = arr[1];
       
       if(tottime<arrT){
        tottime = arrT;
       }
       int wt = tottime-arrT + prepT;
       totwt +=wt;
       tottime +=prepT;
       }
       return totwt/customers.length;
    }
}