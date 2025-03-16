class Solution {
    public int rob(int[] nums) {
        // int prev = 0;
        // int maxi = 0;
        // for(int num : nums){
        //     int temp = Math.max(maxi , prev+ num);
        //      prev= maxi;
        //     maxi = temp;
        // }
        // return maxi;

        int n = nums.length ;
        if(n==1)return nums[0];

        int[] dp = new int[n];

        dp[0]=nums[0];
        dp[1]= Math.max(nums[0],nums[1]);

        for(int i = 2;i<n;i++){
            dp[i]= Math.max(dp[i-1], nums[i]+ dp[i-2]);
        }
        return dp[n-1];
    }
}