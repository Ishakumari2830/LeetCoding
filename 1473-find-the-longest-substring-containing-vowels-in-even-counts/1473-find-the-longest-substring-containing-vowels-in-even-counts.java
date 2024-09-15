class Solution {
    public int findTheLongestSubstring(String s) {
       HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1); // storing the range to return the max range
        int cnt = 0;
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // Toggle the bit corresponding to the vowel
                cnt ^= (1 << ("aeiou".indexOf(ch)));
            }
            
            if (mpp.containsKey(cnt)) {
                ans = Math.max(ans, i - mpp.get(cnt));
            } else {
                mpp.put(cnt, i);
            }
        }
        
        return ans;
    }
}