class Solution {
    private int[] rec(int[] nums){
        int n = nums.length;
      //  int sum = 0;
        int[] newNums = new int[n-1];
        for(int i = 1;i<n;i++){
            newNums[i-1]= (nums[i-1] + nums[i])% 10;
          //  sum += newNums[i];
        }
        return newNums;

    }
    public int triangularSum(int[] nums) {
       while (nums.length > 1) {
            nums = rec(nums); 
        }
        return nums[0];
       
    }
}
        
