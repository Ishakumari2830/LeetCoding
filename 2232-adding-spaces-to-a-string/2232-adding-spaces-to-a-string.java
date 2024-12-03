class Solution {
    public String addSpaces(String s, int[] spaces) {
       StringBuilder res = new StringBuilder();
       int ind = 0;
       for(int i = 0;i<s.length();i++){
        if(ind<spaces.length && i == spaces[ind]){
            res.append(" ");
            ind++;
        }
        res.append(s.charAt(i));
       }
       return res.toString();
    }
}