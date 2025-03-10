class Solution {
    
    public long countOfSubstrings(String word, int k) {
        return atLK(word,k)-atLK(word,k+1);
    }
    private long atLK(String word ,int k){
        long num = 0;
        int s = 0,e = 0;
        HashMap<Character,Integer> Vcnt = new HashMap<>();
        int cCnt = 0;
        while(e < word.length()){
            char newL = word.charAt(e);

            if(isVowel(newL)){
                Vcnt.put(newL , Vcnt.getOrDefault(newL , 0)+1);
            }
            else {
                cCnt++;
            }
            while(Vcnt.size()==5 && cCnt >= k){
                num += word.length()- e;
                char start = word.charAt(s);
                if(isVowel(start)){
                    Vcnt.put(start, Vcnt.get(start) -1);
                    if(Vcnt.get(start)==0){
                        Vcnt.remove(start);
                    }
                }
                else {
                    cCnt --;
                }
                s++;
            }
            e++;
        }
        return num;

    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}