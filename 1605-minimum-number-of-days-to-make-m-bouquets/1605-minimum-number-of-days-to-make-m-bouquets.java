class Solution {
    boolean psbl(int[] arr,int day,int m,int k){
        int cnt = 0;
        int noOfBq=0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else {
            noOfBq += (cnt/k);
            cnt = 0;
            }
        }
        noOfBq += (cnt/k); 
        return noOfBq >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long value = (long)(m)*(long)(k);
        if(value> bloomDay.length) return -1;
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i = 0;i<bloomDay.length;i++){
            mini = Math.min(mini,bloomDay[i]);
            maxi = Math.max(maxi,bloomDay[i]);

        }
        int low = mini,high = maxi;
        //int ans = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(psbl(bloomDay,mid,m,k)){
                
                high = mid-1;

            }
            else
            low = mid+1;

        }
        return low;
    }
}
