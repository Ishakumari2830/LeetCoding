class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> mpp = new HashMap<>();

       for(int i = 0;i<nums.length;i++){
          if(mpp.containsKey(nums[i]) && mpp.get(nums[i]) >= 1)return true;
        mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

       // if(mpp.containsKey(nums[i]) && mpp.get(nums[i]) >= 1)return true;
       }

       return false;

    }
}