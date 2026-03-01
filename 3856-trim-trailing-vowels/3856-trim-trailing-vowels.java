class Solution {
    public String trimTrailingVowels(String s) {
        HashSet<Character> st = new HashSet<>();
        StringBuilder str = new StringBuilder();
        str.append(s);
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');

        for(int i = s.length()-1 ; i>= 0;i--){
               if(!st.contains(s.charAt(i))){
                  break;
               } else{
                str.deleteCharAt(i); 
               }
        }
        return str.toString();
    }
}