class Solution {
    void twosum(int[] nums,int target, int i , int j, List<List<Integer>> ans){
        while(i <j){
            if(nums[i] + nums[j] > target)j--;
            else if(nums[i] + nums[j] < target)i++;
            else {
                  ans.add(Arrays.asList(-target, nums[i], nums[j]));
                while(i < j && nums[i] == nums[i+1])i++;
                while(i<j && nums[j]== nums[j-1])j--;
                 i++;
            j--;
            }
            
           


        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n <3)return new ArrayList<>();
      List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1])continue;
            int n1 = nums[i];
            int target = -n1;
            twosum(nums,target, i+1, n-1,ans);
        }
        return ans;

           
    }
}