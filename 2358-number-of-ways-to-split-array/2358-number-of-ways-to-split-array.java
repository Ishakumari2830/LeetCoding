class Solution {
    public int waysToSplitArray(int[] nums) {
        long sumleft = 0;
        long sumright = 0;
        for(int num : nums){
            sumright += num;
        }
        int cnt = 0;
        for(int i= 0;i<nums.length-1;i++){
            sumleft += nums[i];
            sumright -=nums[i];
            if(sumleft>=sumright)cnt++;
        }
        return cnt;
    }
}