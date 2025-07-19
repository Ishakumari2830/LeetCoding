class Solution {
    private int f(int[] nums){
        int n = nums.length;
        int prev2 = 0,prev1 = nums[0];
        for(int i = 1;i<n;i++){
            int pick = nums[i];
            if(i>1){
                pick += prev2;
            
            }
            int notpick = 0 + prev1;
            int curr = Math.max(pick , notpick);
            prev2 = prev1;
            prev1 = curr;
        

        }
        return prev1;

    }
    public int rob(int[] nums) {
       int n = nums.length;
       if(n==1)return nums[0];
       int[] temp1 = new int[n-1];
       int[] temp2 = new int[n-1];
       int j = 0;
       int k = 0;
    
       for(int i = 0;i<n;i++){
        if(i != 0){
            temp1[j] = nums[i];
            j++;
        }
        if(i != n-1){
            temp2[k] = nums[i];
            k++;
        }
       }
       return Math.max(f(temp1),f(temp2));
    }
}