class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,target, candidates, ds,ans);
        return ans;
    }
    public void solve(int ind, int target ,int[] candidates,List<Integer> ds,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        //we are traversing for each element starting from the ind that we reached
        for(int i = ind ;i<candidates.length;i++){
            //first cndtn is used for not giving index out of bound for 2nd conditon
            //this cnditon is used to check if the next elemnt is same as prev then we dont have to use recursive as it will give not unique res
                    if(i > ind && candidates[i]==candidates[i-1])continue;
                 //this we are using to optimize as arr is sorted and if value is greater than target then we can never match
                    if(candidates[i] > target)break;

                    ds.add(candidates[i]);
                    solve(i+1 , target - candidates[i],candidates,ds,ans);
                    //as after completing rec , going up ,we are removing the added ele from ds
                    ds.remove(ds.size()-1);
        }
    }
}