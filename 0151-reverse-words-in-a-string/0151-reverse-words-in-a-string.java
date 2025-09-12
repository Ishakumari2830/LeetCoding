import java.util.StringTokenizer;
class Solution {
     public void reverse(char[] ch, int s, int e) {
        while (s < e) {  
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
    public String reverseWords(String s) {
        // StringTokenizer st = new StringTokenizer(s, " ");
        // StringBuilder sb = new StringBuilder();
        // while(st.hasMoreElements()){
        //     sb.insert(0, st.nextToken()+ " ");

        // }

      char[] ch = s.toCharArray();
        int n = ch.length;

        // Step 1: Reverse the whole string
        reverse(ch, 0, n - 1);

        int i = 0, l = 0, r = 0;

        // Step 2: Reverse each word
        while (i < n) {
            // Copy characters until space
            while (i < n && ch[i] != ' ') {
                ch[r] = ch[i];
                i++;
                r++;
            }

            // If we got a word, reverse it
            if (l < r) {
                reverse(ch, l, r - 1);

                // Add single space *only if* more words exist
                if (i < n) {
                    ch[r] = ' ';
                    r++;
                }
                l = r;
            }
            i++;
        }

        // Step 3: Build final string (no trailing space)
        return new String(ch, 0, r).trim();

    }
}