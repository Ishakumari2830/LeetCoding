class Solution {
    int fun(int[] nums,int k){
        int l=0,r=0,cnt =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(r<nums.length){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l],mpp.get(nums[l])-1);
                if(mpp.get(nums[l])==0){
                    mpp.remove(nums[l]);
                }
                l=l+1;
            }
            cnt = cnt + (r-l+1);
            r = r+1;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k) - fun(nums,k-1);
    }
}