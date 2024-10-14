class Solution {
    private int countOfSubsetSum(int[] nums, int sum) {
        int n = nums.length;
        // DP array to store the number of ways to form each sum
        int[][] dp = new int[n + 1][sum + 1];

        // Initialize the dp array for sum = 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;  // There's 1 way to get sum 0 (by selecting no elements)
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

        // The answer will be stored in dp[n][sum]
        return dp[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        
         int sumOfArray = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            sumOfArray += num;
        }

        // Edge case: If target is greater than sum or if sum + target is odd, return 0
        if (target > sumOfArray || (sumOfArray - target) % 2 !=0) {
            return 0;
        }

        // Calculate the required subset sum
        int sum = (sumOfArray - target) / 2;

        // Find the number of subsets with sum equal to the calculated sum
        return countOfSubsetSum(nums, sum);

        
    }
}