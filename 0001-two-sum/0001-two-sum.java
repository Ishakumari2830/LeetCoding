class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> mpp = new HashMap<>();
       int[] ans = new int[2];
       ans[0]=ans[1]=-1;
       int n = nums.length;
       for(int i = 0;i<n;i++){
        int num = nums[i];
        int req = target - num;
        if(mpp.containsKey(req)){
            ans[0]=mpp.get(req);
            ans[1]=i;
        }
        mpp.put(nums[i],i);

       }
       return ans;

    }
}