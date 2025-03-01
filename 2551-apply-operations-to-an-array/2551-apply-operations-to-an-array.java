class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i = 0;i< nums.length-1 ;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1]= 0;
            }

        }
        int nonZero = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[nonZero]=nums[i];
                nonZero++;
            }
        }
        while(nonZero <n){
            nums[nonZero]=0;
            nonZero++;

        }
        return nums;

    }
}