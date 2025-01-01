class Solution {
    public int maxScore(String s) {
         int totalone = 0;
         for(int i = 0;i<s.length();i++){
            if(s.charAt(i)== '1')totalone++;
         }
         int cnt0 = 0;
         int cnt1 = 0;
         int maxi = Integer.MIN_VALUE;
         for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)== '0')cnt0++;
            else cnt1 ++;
            int remaining = totalone-cnt1;
            int sum = remaining + cnt0;
             maxi = Math.max(sum , maxi);
         }
         return maxi;
    }
}