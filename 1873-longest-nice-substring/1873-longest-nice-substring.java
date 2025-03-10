class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length() < 2)return "";
        char[] arr = s.toCharArray();
        Set<Character> st = new HashSet<>();
        for(char c : arr)st.add(c);
        for(int i = 0;i<arr.length ;i++){
            char c = arr[i];
            if(st.contains(Character.toUpperCase(c)) && st.contains(Character.toLowerCase(c)))continue;
            String sb1 = longestNiceSubstring(s.substring(0,i));
            String sb2 = longestNiceSubstring(s.substring(i+1));
            return sb1.length() >= sb2.length() ? sb1 : sb2;
        }
        return s;
    }
}