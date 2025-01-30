class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currSum = nums[0];
        for(int i = 1;i<nums.length;i++){
            currSum = Math.max(nums[i],nums[i]+ currSum);
            maxsum = Math.max(maxsum,currSum);
        }
        return maxsum;
    }
}