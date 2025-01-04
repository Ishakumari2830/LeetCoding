class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> ltrs = new HashSet();
        for(Character c : s.toCharArray()){
            ltrs.add(c);
        }
        int ans = 0;
        for(Character ltr : ltrs){
            int i = -1,j = 0;
            for(int k = 0;k<s.length();k++){
                if(s.charAt(k)== ltr){
                    if(i==-1){
                        i=k;
                        
                    }
                    j=k;
                }
            }

            Set<Character> st = new HashSet();
            for(int k = i+1;k<j;k++){
                st.add(s.charAt(k));
            }
            ans +=  st.size();
        }
        return ans;

    }
}