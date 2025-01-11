class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k)return false;
        int[] alph = new int[26];
        for(char c : s.toCharArray()){
            alph[c-'a']++;
        }
        int cntodd = 0,cnteven = 0;
        for(int i = 0;i<26;i++){
            if(alph[i]% 2 == 0)cnteven++;
            else cntodd++;
        }  
       return cntodd <=k;
              

    }
}