class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE,n = nums.length;
        for(int i = 0;i< n;i++){
            int or = 0,len = 0;
            for(int j = i;j<n;j++){
                or |= nums[j];
                len++;
                if(or >= k)ans = Math.min(ans,len);
            
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}