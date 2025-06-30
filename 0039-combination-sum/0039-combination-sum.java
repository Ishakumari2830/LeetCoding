class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(0, candidates, target, ans,ds);
        return ans;
    }
    public void solve(int ind ,int[] candidates, int target,List<List<Integer>> ans ,  List<Integer> ds ){
        int n = candidates.length;
        if(ind == n){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
             return ;


        }
        if(candidates[ind] <= target){
            ds.add(candidates[ind]);
            solve(ind ,candidates, target-candidates[ind], ans,ds);
            ds.remove(ds.size()-1);
        }
       // ds.remove(candidates[ind]);
        solve(ind +1 , candidates, target, ans,ds);
    }
}