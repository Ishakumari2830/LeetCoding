class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int val = (target -'a');
        int mini = Integer.MAX_VALUE;
        for(char c : letters){
            int cVal = c-'a';
            if(cVal > val){
                mini = Math.min(mini,cVal);
                return (char)(mini + 97);
            }


        }
        return letters[0];
    }
}