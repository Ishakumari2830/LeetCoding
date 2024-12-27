class Solution {
    public int maxScoreSightseeingPair(int[] values) {
      int maxscr = Integer.MIN_VALUE;
      int maxI = values[0] +0;
      for(int i = 1;i<values.length;i++){
        maxscr = Math.max(maxscr , maxI + values[i]-i);
        maxI = Math.max(maxI,values[i]+i);
      }
      return maxscr;
    }
}