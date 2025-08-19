class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        long zeroes = 0;
        for(int i = 0;i<nums.length;i++){
            zeroes = (nums[i] == 0) ? zeroes +1 : 0;
            cnt += zeroes;

        }
        return cnt;
    }
}