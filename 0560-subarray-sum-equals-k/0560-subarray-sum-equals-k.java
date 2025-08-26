class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer, Integer> mpp = new HashMap<>();
      mpp.put(0,1);
      int cnt = 0;
      int presum = 0;
      for(int i = 0;i<nums.length;i++){
        presum += nums[i];
      //  if(presum == k)cnt++;
        cnt += mpp.getOrDefault((presum - k),0);
        mpp.put(presum , mpp.getOrDefault(presum,0)+1);
       
      }
      return cnt;
    }
}