class Solution {
    public int maxAscendingSum(int[] nums) {
        int cur = nums[0],ans = nums[0];
        for(int i = 1;i<nums.length;i++){
            cur = nums[i] > nums[i - 1] ? cur + nums[i] : nums[i];
            ans = Math.max(ans, cur);


        }
        return ans;
    }
}