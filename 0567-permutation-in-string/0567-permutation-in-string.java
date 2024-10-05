class Solution {
    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        // If s2's length is less than s1's length, no permutation can be found
        if (n2 < n1) {
            return false;
        }

        // Create frequency arrays for s1 and the sliding window in s2
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Fill the frequency arrays for the first window in s2 and for s1
        for (int i = 0; i < n1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Sliding window over s2 starting from index n1 to n2
        for (int i = n1; i < n2; i++) {
            // If the frequency arrays match, we found a valid permutation
            if (matches(s1Count, s2Count)) {
                return true;
            }
            
            // Update the sliding window
            s2Count[s2.charAt(i) - 'a']++;              // Add the new character to the window
            s2Count[s2.charAt(i - n1) - 'a']--;          // Remove the oldest character from the window
        }

        // Final check for the last window
        return matches(s1Count, s2Count); 
    }
}