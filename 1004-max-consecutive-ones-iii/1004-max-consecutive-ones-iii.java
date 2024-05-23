class Solution {
    public int longestOnes(int[] nums, int k) {
       int l=0,r=0,maxlen=0,zeroes=0;
       int n = nums.length;
       while(r<n){
        if(nums[r]==0)zeroes++;
        if(zeroes>k){
            if(nums[l]==0){zeroes--;}
            l++;
        }
        if(zeroes<=k){
            int len = r-l+1;
            maxlen = Math.max(maxlen,len);
            
        }
        r++;
       } 
       return maxlen;
    }
}