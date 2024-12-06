class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            st.add(nums[i]);
        }
        
        for(int i = 1;i<=n;i++){
            if(st.contains(i))continue;
            arr.add(i);

        }
        return arr;
    }
}