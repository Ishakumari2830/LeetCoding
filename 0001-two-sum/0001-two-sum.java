class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> mpp = new HashMap<>();
      int[] ans = new int[2];
      ans[0]=ans[1]=-1;
      for(int i = 0;i<nums.length;i++){
        int num = nums[i];
        int req = target - num;
        if(mpp.containsKey(req)){
            ans[0]=i;
            ans[1]=mpp.get(req);
        }
        mpp.put(nums[i],i);

      }
      return ans;

    }
}