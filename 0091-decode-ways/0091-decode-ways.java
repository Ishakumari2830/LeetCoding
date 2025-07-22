class Solution {
    int solve(int ind , String s,Map<Integer,Character> mpp, int[] t ){
        int cnt = 0;
        int n = s.length();
        if(ind == s.length()){
            // cnt++;
             return 1;
        }
        if(t[ind] != -1)return t[ind];
        for(int i = ind ;i<s.length()  && i < ind + 2;i++){
           String sub =  s.substring(ind,i+1);
            if (sub.charAt(0) == '0') break;
                 if(mpp.containsKey(Integer.parseInt(sub))){
                   cnt += solve(i+1,s,mpp,t);
                 }
        }
        return t[ind] = cnt;
    }
    public int numDecodings(String s) {
        Map<Integer,Character> mpp = new HashMap<>();
        int n = s.length();
        for(int i = 1;i<=26;i++){
            mpp.put(i, (char) ('A'+i-1));
        }
        int[] t = new int[n+1];
        Arrays.fill(t,-1);
        return solve(0 , s , mpp,t);

    }
}