class Solution {
    private int countOfSubsetSum(int[] nums, int sum) {
        int n = nums.length;
      
        int[][] dp = new int[n + 1][sum + 1];

        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;  
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

      
        return dp[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        
         int sumOfArray = 0;

        
        for (int num : nums) {
            sumOfArray += num;
        }

       
        if (target > sumOfArray || (sumOfArray - target) % 2 !=0) {
            return 0;
        }

      
        int sum = (sumOfArray - target) / 2;

        
        return countOfSubsetSum(nums, sum);

        
    }
}