class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder newS = new StringBuilder();
            
            for (int i = 0; i < s.length() - 1; i++) {
                int first = Character.getNumericValue(s.charAt(i));
                int second = Character.getNumericValue(s.charAt(i + 1));
                int sum = (first + second) % 10;
                newS.append(sum);
            }
            
            s = newS.toString();  
        }
        
       
        return s.charAt(0) == s.charAt(1);
    
    }
}