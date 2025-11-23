class Solution {
    public int maxSumDivThree(int[] nums) {
         int[] dp = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int x : nums) {
            int[] newDp = dp.clone();
            for (int r = 0; r < 3; r++) {
                if (dp[r] != Integer.MIN_VALUE) {
                    int newSum = dp[r] + x;
                    int mod = newSum % 3;
                    newDp[mod] = Math.max(newDp[mod], newSum);
                }
            }
            dp = newDp;
        }

        return dp[0];
    }
}