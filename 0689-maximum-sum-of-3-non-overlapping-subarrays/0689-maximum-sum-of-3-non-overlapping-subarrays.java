class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
       int n = nums.length; 
       int[] prefix = new int[n+1];
       for(int i = 1;i<=n;i++){
        prefix[i]=prefix[i-1]+ nums[i-1];
       }

       int[][] sum = new int[4][n+1];
       int[][] ind = new int[4][n+1];

       for(int sub = 1;sub<= 3;sub++){
        for(int endind = k* sub;endind <=n;endind++){
            int curr = prefix[endind]-prefix[endind -k]+ sum[sub-1][endind-k];
              if (curr > sum[sub][endind - 1]) {
                   sum[sub][endind] = curr;
                   ind[sub][endind] = endind - k;
                } else {
                   sum[sub][endind] =
                        sum[sub][endind- 1];
                    ind[sub][endind] =
                        ind[sub][endind - 1];
                }
        }
       }
       int[] res = new int[3];
       int currend = n;
       for(int i = 3;i>=1;i--){
        res[i-1]=ind[i][currend];
        currend = res[i-1];
       }
       return res;
    }
}