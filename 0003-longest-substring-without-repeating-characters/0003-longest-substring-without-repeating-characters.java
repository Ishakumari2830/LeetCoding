class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> st = new HashSet<>();
       int l = 0,r = 0;
       int maxi = 0 ;
       while(r < s.length()){
          if(!st.contains(s.charAt(r))){
            st.add(s.charAt(r));
            
            maxi = Math.max(maxi , r-l +1);
            r++;

          }else{
            st.remove(s.charAt(l));
            l++;
          }
       }
       return maxi;
    }
}