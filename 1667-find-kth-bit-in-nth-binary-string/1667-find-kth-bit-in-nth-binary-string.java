class Solution {
    public char findKthBit(int n, int k) {
         String s = generateNthString(n);
        return s.charAt(k - 1);
    }
     private String generateNthString(int n) {
        String s = "0"; // Base case: S1 = "0"
        for (int i = 2; i <= n; i++) {
            s = s + "1" + invertAndReverse(s); // Build the sequence iteratively
        }
        return s;
    }

    private String invertAndReverse(String s) {
        StringBuilder inverted = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                inverted.append('1');
            } else if (ch == '1') {
                inverted.append('0');
            }
        }
        return inverted.reverse().toString(); // Reverse and convert to string
    }
}