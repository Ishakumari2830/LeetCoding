class Solution {
    private void solve(int ind, int[] arr,int target,List<Integer> al, List<List<Integer>> ans){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(al));

            }
            return;
        }
        if(arr[ind] <= target){
            al.add(arr[ind]);
            solve(ind,arr,target - arr[ind],al,ans);
            al.remove(al.size()-1);
            
        }
        solve(ind+1,arr,target,al,ans);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        solve(0,candidates,target,al,ans);
        return ans;

    }
}