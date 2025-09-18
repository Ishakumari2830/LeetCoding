class Solution {
    public String minWindow(String s, String t) {

      int n = s.length();
        if (t.length() > n) return "";

        // Frequency map for characters in t
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (char c : t.toCharArray()) {
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
        }

        int reqCnt = t.length();
        int i = 0, j = 0;
        int minWindSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) {
            char c = s.charAt(j);

            if (mpp.containsKey(c)) {
                if (mpp.get(c) > 0) {
                    reqCnt--;  // one required char found
                }
                mpp.put(c, mpp.get(c) - 1);  // decrease its frequency
            }

            // Shrink the window
            while (reqCnt == 0) {
                int currWindSize = j - i + 1;
                if (minWindSize > currWindSize) {
                    minWindSize = currWindSize;
                    start_i = i;
                }

                char leftChar = s.charAt(i);
                if (mpp.containsKey(leftChar)) {
                    mpp.put(leftChar, mpp.get(leftChar) + 1);
                    if (mpp.get(leftChar) > 0) {
                        reqCnt++;  // we need this char again
                    }
                }
                i++;
            }
            j++;
        }

        return minWindSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWindSize);
    }
}