class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i = 0;i<nums.length ;i++){
            total += nums[i];
        }
        int left = 0;
        for(int i = 0;i<nums.length ;i++){
            total -= nums[i];
            if(total == left) return i;
            left += nums[i];
        }
        return -1;

    }
}