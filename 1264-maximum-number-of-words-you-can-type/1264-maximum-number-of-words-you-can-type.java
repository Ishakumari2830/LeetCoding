class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt = 0;
        HashSet<Character> st = new HashSet<>();
        for(int i = 0;i<brokenLetters.length();i++){
            st.add(brokenLetters.charAt(i));
        }

        String[] words = text.split(" ");
        int tot = words.length;
        for(String word : words){
            char[] ch = word.toCharArray();
            for(int i = 0;i<ch.length;i++){
                if(st.contains(ch[i])){
                    cnt++;
                    break;
                }
            }
        }
        return tot - cnt;
    }
}