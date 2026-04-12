class Solution {
    public String removeDuplicateLetters(String s) {
       Stack<Character> st = new Stack<>();
       StringBuilder sb = new StringBuilder();
       int[] freq = new int[26];
       boolean[] vis = new boolean[26];

       for(char c : s.toCharArray()){
          freq[c - 'a']++;
       }

       for(char c : s.toCharArray()){
           freq[c-'a']--;
           if(vis[c-'a'])continue;

           while(!st.isEmpty() && st.peek() > c && freq[st.peek() -'a'] > 0){
             vis[st.pop() -'a']= false;
               
           }
           st.push(c);
           vis[c-'a'] = true;
       }
       for(char c : st){
         sb.append(c);
       }
      return sb.toString();
    }
}