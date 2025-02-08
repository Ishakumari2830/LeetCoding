class Solution {
    public int maxProduct(int[] nums) {
        //kadanes alg
        int prod = 1;
        int maxi = Integer.MIN_VALUE;
      
      
        for(int i = 0;i<nums.length;i++){
            prod = prod*nums[i];
            maxi = Math.max(maxi,prod);
            if(prod == 0)prod =1;
         
        }
        prod = 1;
          for(int i = nums.length-1;i>=0;i--){
            prod = prod*nums[i];
            maxi = Math.max(maxi,prod);
            if(prod == 0)prod =1;
         
        }
        return maxi;
    }
}