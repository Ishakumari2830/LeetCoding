class Solution {
    public int minimumRecolors(String blocks, int k) {
      int cnt = Integer.MAX_VALUE;
      int l = 0;
      int cntw = 0;
      for(int r = 0;r<blocks.length();r++){
        if(blocks.charAt(r)=='W')cntw ++;
        if(r-l +1 == k){
            cnt = Math.min(cnt , cntw);
            if(blocks.charAt(l)=='W')cntw--;
            l++;
        }

      }
      return cnt;

        
    }
}