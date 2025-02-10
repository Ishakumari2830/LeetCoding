class Solution {
    public String clearDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int c = 0;c<s.length();c++){
            if(Character.isDigit(s.charAt(c))  && ans.length() != 0){
                ans.setLength(ans.length() -1);
            } else {
                ans.append(s.charAt(c));
            }
        }
        return ans.toString();
    }
}