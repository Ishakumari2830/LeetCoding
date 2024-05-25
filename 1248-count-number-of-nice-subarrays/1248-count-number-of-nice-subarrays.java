//same as binary subarray with sum, just convert even to even as 0, and odd to 1
class Solution {
    int fun(int[] nums,int k){
        
        if(k<0)return 0;
        int l =0,r=0,sum =0,cnt =0;
        while(r<nums.length){
            sum = sum + (nums[r]%2);
            while(sum>k){
                sum = sum-(nums[l]%2);
                l=l+1;

            }
            cnt = cnt + r-l+1;
            r= r+1;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return ((fun(nums,k))-fun(nums,(k-1)));
    }
}