class Solution {
    static void FindComb(int ind,int[] arr,List<Integer> ds,List<List<Integer>> ans,int target){
        if(ind==arr.length){
            if(target==0){
               ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            FindComb(ind,arr,ds,ans,target-arr[ind]);
            ds.remove(ds.size()-1);
           



        }
         FindComb(ind+1,arr,ds,ans,target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        FindComb(0,candidates,ds,ans,target);
        return ans;
        
    }
}