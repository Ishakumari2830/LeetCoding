class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer,Integer> mpp = new TreeMap<>();
        int l= 0,r = 0;
        int n = nums.length;
        long cnt = 0;
        while(r <n){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);

            while(mpp.lastEntry().getKey() - mpp.firstEntry().getKey() > 2){
                mpp.put(nums[l],mpp.get(nums[l])-1);//remove leftmost
                if(mpp.get(nums[l])== 0){
                    mpp.remove(nums[l]);
                }
                l++;


            }
            cnt += r - l+1;
            r++;
        }

        
       

        return cnt;
      
        
    }
}