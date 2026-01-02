class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int ans =  0;
        int len = nums.length ;
        int n = len /2;
        for(int i = 0;i<len-1; i++){
            if(nums[i] == nums[i+1]){
                ans =  nums[i];
            }
        }
        return ans;
        
    }
}