class Solution {
    private boolean backtrack(int ind ,int[] nums, int[] sums, int targetsum){
        if(ind < 0)return true;
        for(int i = 0;i<sums.length ;i++){
            if(sums[i] + nums[ind] > targetsum)continue;
            sums[i] += nums[ind];
            if(backtrack(ind -1 ,nums,sums,targetsum))return true;
            sums[i] -= nums[ind];

            if(sums[i]== 0)break;
        }
        return false;

    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
       for(int i = 0;i<nums.length;i++){
           sum += nums[i];

       } 
       if((sum % k ) != 0  || nums.length < k)return false;
       Arrays.sort(nums);
       int tot = sum/k;
       return backtrack(nums.length -1 , nums, new int[k], tot);

    }
}