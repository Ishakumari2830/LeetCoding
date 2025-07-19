class Solution {
     public int rob(int[] nums) {
       int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
      // int[] t = new int[n];
      // Arrays.fill(t,-1);
    //   return f(nums,n,t);
     return f(nums,n);


    }
    //recursion
    // private int f(int[] nums,int n){
    //      if(n == 0)return nums[n];
    //    if(n < 0)return 0;
    //    int pick = nums[n] + f(nums,n-2);//since not adjacent
    //    int notPick = 0 + f(nums,n-1);
    //    return Math.max(pick , notPick);

    // }

    //private int f(int[] nums,int n,int[] t){
        //memoization
        // if(n == 0)return nums[n];
        // if(n <0)return 0;

        // if(t[n] != -1 )return t[n];
        // int pick = nums[n] + f(nums,n-2,t);
        // int notpick = 0 + f(nums,n-1,t);
        // return t[n]= Math.max(pick , notpick);


        //tabulation
        // t[0]= nums[0];
        
        // for(int i = 1;i<n;i++){
        //     int pick = nums[i];
        //     if(i > 1){
        //         pick += t[i-2];
        //     }
        //     int notpick = 0+ t[i-1];
        //     t[i]= Math.max(pick,notpick);
        // }
        // return t[n-1];
        private int f(int[] nums,int n){
        //space optimization

        int prev1 = nums[0],prev2 = 0;
        for(int i = 1;i<n;i++){
            int pick = nums[i] ;
            if(i>1){
                pick += prev2;

            }
            int notpick = 0 + prev1;
            int curr = Math.max(pick ,notpick);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
   
