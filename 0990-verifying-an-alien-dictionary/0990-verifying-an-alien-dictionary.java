class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];
        for(int i = 0;i<orderMap.length;i++){
            orderMap[order.charAt(i) - 'a'] = i;
             }

        for(int i = 0;i<words.length -1 ;i++){
            for(int j = 0;j<words[i].length() ; j++){
                if(j >= words[i+1].length())return false; //for apple , app

                if(words[i].charAt(j)  != words[i+1].charAt(j)){
                    int currchar = words[i].charAt(j) -'a';
                    int nextchar = words[i+1].charAt(j)-'a';

                    if(orderMap[currchar] > orderMap[nextchar])return false;
                    else break;//dont need to find other char
                }
            }
        }
        return true;
    }
}