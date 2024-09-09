class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        int jump=0,farthest=0,currentend=0;
        for(int i =0;i<n-1;i++){
            farthest = Math.max(farthest,i+nums[i]);

            if(i==currentend){
                jump++;
                currentend= farthest;
                if(currentend >= n-1)break;
            }
        }
        return jump;
    }
}