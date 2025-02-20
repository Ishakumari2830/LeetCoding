class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(String num : nums){
            st.add(Integer.parseInt(num,2));
        }
        int n = nums.length ;
        for(int i = 0;i<=n;i++){
           if(!st.contains(i)){
            String ans = Integer.toBinaryString(i);
            while(ans.length() < n){
                ans = "0" +ans;
            }
            return ans;
           }
        }
        return "";
    }
}