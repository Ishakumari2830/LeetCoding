class Solution {
    private void solve(int ind , List<Integer> al,int[] nums,List<List<Integer>> ans){
   
            ans.add(new ArrayList<>(al));
            
        for(int i = ind ;i<nums.length ;i++){
            if(i != ind && nums[i] == nums[i-1])continue;
            al.add(nums[i]);
            solve(i +1 , al,nums,ans);
            al.remove(al.size()-1);
            //solve(i+1,al,nums,ans);


        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        solve(0,al,nums,ans);
        return ans;
    }
}