class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> sets = new HashSet<>();
        for(char i : allowed.toCharArray()){
            sets.add(i);
        }
        int cnt =0;
        for(String word : words){
             boolean isConsistent = true;
            for(char letter : word.toCharArray()){
                if(!sets.contains(letter)){
                    isConsistent = false;
                    break;
                }
               
            }
            if(isConsistent){
                cnt++;
            }
        }
        return cnt;
    }
}