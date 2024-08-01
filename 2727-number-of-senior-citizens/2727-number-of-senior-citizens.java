class Solution {
    public int countSeniors(String[] details) {
        int cnt =0;
       for (String detail : details) {
            if (detail.length() > 12) { // Ensure the string is long enough
                if (detail.charAt(11) == '6' && detail.charAt(12) > '0') {
                    cnt++;
                }
                if (detail.charAt(11) > '6') {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}