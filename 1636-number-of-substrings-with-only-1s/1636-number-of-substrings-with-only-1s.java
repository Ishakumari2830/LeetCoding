class Solution {
    public int numSub(String s) {
        final int MOD = 1000000007;
        long tot = 0;
        int len = s.length();
        long k= 0;
        for(int i = 0;i<len ;i++){
            char c = s.charAt(i);
            if(c=='0'){
                tot += (k * (k +1)) /2;
                tot %= MOD;
                k= 0;
            } else {
                k++;
            }
        }
        tot += (k*(k+1))/2;
        tot %= MOD;
        return (int)tot;
    }
}