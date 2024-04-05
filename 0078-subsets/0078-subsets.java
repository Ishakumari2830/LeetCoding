class Solution {
   // static void find(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ans){
    //     if(ind == nums.length){
    //         ans.add(new ArrayList(ds));
    //         return;
    //     }
    //     ds.add(nums[ind]);
    //     find(ind+1,nums,ds,ans);
    //     ds.remove(ds.size()-1);
    //     find(ind+1,nums,ds,ans);
        

    // }

     public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     find(0,nums,new ArrayList<>(),ans);
    //     return ans;
        


        //using bit manipulation
         List<Integer> lst;
List<List<Integer>> ans = new ArrayList<>();
int n = nums.length;
int subsets = 1 << n;
for (int num = 0; num < subsets; num++) {
    lst = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        if ((num & (1 << i)) != 0) {
            lst.add(nums[i]);
        }
    }
    ans.add(lst);
}
return ans;

    }
}