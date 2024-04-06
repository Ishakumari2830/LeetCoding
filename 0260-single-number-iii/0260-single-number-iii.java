class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor =0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            xor = xor^nums[i];

        }
        int cnt =0;
        while(xor!=0){
            if((xor & 1)!=0) break;
            cnt++;
            xor = xor>>1;
        }
        int xor1 =0,xor2=0;
        for(int i =0;i<n;i++){
            if((nums[i] & (1<<cnt))!=0 ){
                xor1= xor1^nums[i];
            }
            else
            xor2 = xor2^nums[i];
        }
        ans[0]=xor1;
        ans[1]=xor2;
        return ans;
            }
}