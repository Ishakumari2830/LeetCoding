class Solution {
    public boolean canAliceWin(int[] nums) {
       int sum1 =0,sum2=0, rest =0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]/10 == 0){
            sum1 = sum1 + nums[i];
        }
       else if(nums[i]/10 > 0 && nums[i]/10 <= 9){
            sum2 = sum2 + nums[i];
        }
        else if(nums[i]/10 >= 10){
            rest = rest + nums[i];
        }
       }
       if(sum1 == sum2 || rest > sum2 ) return false;

       return true;
    }
}