class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1 ;i<nums.length;i++){
            if(nums[i-1]== nums[i]){
                ans.add(nums[i]);
            }
        }
         int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}