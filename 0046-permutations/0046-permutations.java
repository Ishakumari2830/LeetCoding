class Solution {
    private void solve(List<Integer> al,int[] nums,List<List<Integer>> ans){
        if(al.size() == nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = 0;i<nums.length ;i++ ){
            if(al.contains(nums[i]))continue;
        al.add(nums[i]);
        solve(al,nums,ans);
        al.remove(al.size()-1);
        //solve(ind +1,al,nums,ans);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al  = new ArrayList<>();
        solve(al,nums,ans);
        return ans;
    }
}