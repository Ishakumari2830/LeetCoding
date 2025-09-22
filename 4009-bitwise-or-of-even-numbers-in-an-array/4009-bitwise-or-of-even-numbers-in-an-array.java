class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bitwiseOr = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] %2 == 0){
                bitwiseOr |= nums[i];
            }
        }
        return bitwiseOr;

    }
}