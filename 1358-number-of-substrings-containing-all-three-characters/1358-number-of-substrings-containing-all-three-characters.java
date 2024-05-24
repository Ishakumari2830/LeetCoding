class Solution {
    public int numberOfSubstrings(String s) {
       int[] lastseen={-1,-1,-1};
       int cnt = 0;
       for(int i =0;i<s.length();i++){
        lastseen[s.charAt(i)-'a']=i;
        if(lastseen[0] != -1 && lastseen[1] != -1 &&lastseen[2] != -1 ){
            cnt = cnt + Math.min(Math.min(lastseen[0],lastseen[1]),lastseen[2])+1;
        }
       } 
       return cnt;
    }
}