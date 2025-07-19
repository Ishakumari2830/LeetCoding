class Solution {
     public int rob(int[] nums) {
       int n = nums.length;
       int[] t = new int[n];
       Arrays.fill(t,-1);
      return f(nums,n-1,t);


    }
    //recursion
    // private int f(int[] nums,int n){
    //      if(n == 0)return nums[n];
    //    if(n < 0)return 0;
    //    int pick = nums[n] + f(nums,n-2);//since not adjacent
    //    int notPick = 0 + f(nums,n-1);
    //    return Math.max(pick , notPick);

    // }

    private int f(int[] nums,int n,int[] t){
        
        if(n == 0)return nums[n];
        if(n <0)return 0;

        if(t[n] != -1 )return t[n];
        int pick = nums[n] + f(nums,n-2,t);
        int notpick = 0 + f(nums,n-1,t);
        return t[n]= Math.max(pick , notpick);
    }
}
   
