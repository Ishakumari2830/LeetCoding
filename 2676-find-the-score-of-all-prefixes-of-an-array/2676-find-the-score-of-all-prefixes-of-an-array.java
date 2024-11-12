class Solution {
    public long[] findPrefixScore(int[] nums) {
          long[] ans = new long[nums.length];
        int maxValue = nums[0];
        ans[0] = nums[0] + maxValue; 

        for (int i = 1; i < nums.length; i++) {
            maxValue = Math.max(maxValue, nums[i]); 
            ans[i] = nums[i] + maxValue + ans[i - 1]; 
        }

        return ans;
    }
}