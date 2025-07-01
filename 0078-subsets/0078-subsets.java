class Solution {
    //use recusion with pic and not pick
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,nums, ans, new ArrayList<>());
        return ans;
    }
    public void solve(int ind , int[] nums , List<List<Integer>> ans, List<Integer> ds){
        if(ind == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        solve(ind+1 ,nums,ans,ds);
        ds.remove(ds.size()-1);
        solve(ind +1 , nums,ans,ds);
    }
}