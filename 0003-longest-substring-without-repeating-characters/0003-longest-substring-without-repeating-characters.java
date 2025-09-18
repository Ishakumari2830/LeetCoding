class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int left = 0, right = 0;
        int maxi = 0;
        while(right <s.length()){
            char c = s.charAt(right);
            if(!st.contains(c)){
                st.add(c);
                maxi = Math.max(maxi , right - left +1);
                right ++;
            } else {
                st.remove(s.charAt(left));
                left++;
            }

        }
        return maxi;
    }
}