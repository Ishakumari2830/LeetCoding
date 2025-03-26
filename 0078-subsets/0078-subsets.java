class Solution {
    private void solve(int ind ,List<Integer> al, int[] nums, List<List<Integer>> ans ){
        if(ind == nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[ind]);
        solve(ind+1,al,nums,ans);
        al.remove(al.size()-1);
        solve(ind+1,al,nums,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        solve( 0 , al , nums, ans);
        return ans;
    }
}