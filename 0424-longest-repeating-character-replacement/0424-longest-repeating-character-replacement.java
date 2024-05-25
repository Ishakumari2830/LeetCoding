class Solution {
    public int characterReplacement(String s, int k) {
       int l=0,r=0,maxlen=0,maxf=0;
       HashMap<Character,Integer> mpp = new HashMap<>();
       while(r<s.length()){
        char currentChar = s.charAt(r);
        mpp.put(currentChar,mpp.getOrDefault(currentChar,0)+1);
        maxf = Math.max(maxf,mpp.get(currentChar));
        while((r-l+1)-maxf>k){
            //to make it more optimize 
            //use if instead of while and remove for loop and maxf=0(15,19)
            char leftChar = s.charAt(l);
            mpp.put(leftChar,mpp.get(leftChar)-1);
            l++;
            maxf = 0;
            for(int freq : mpp.values()){
                maxf = Math.max(maxf,freq);

            }
        }
        if((r-l+1)-maxf <= k){
            maxlen = Math.max(maxlen,(r-l+1));
        }
        r++;


       }
       return maxlen;
    }
}