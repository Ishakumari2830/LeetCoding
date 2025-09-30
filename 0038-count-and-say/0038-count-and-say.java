class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s = "1";
        for(int i = 2;i<= n ;i++){
            s = solve(s);
        }
        return s ;
    }
    private String solve(String s){
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1))cnt++;
            else {
                sb.append(cnt).append(s.charAt(i-1));
                cnt = 1;
            }
            
        }
         sb.append(cnt).append(s.charAt(s.length()-1));
         return sb.toString();
    }
}