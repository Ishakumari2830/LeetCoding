class Solution {
    public int sortPermutation(int[] nums) {
        //set all bit of 
        int k = -1;
        for(int i = 0;i<nums.length ; i++){
            if(nums[i] != i){
                k = (k & nums[i]);
            }
        }
        return k== -1 ? 0 : k;


    }
}