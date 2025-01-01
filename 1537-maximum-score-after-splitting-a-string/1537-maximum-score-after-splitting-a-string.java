class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                totalOnes++;
            }
        }
        int score =0,ZeroCount=0,OneCount=0;
        for(int i=0 ;i<s.length()-1;i++){
            if(s.charAt(i)=='0')
            ZeroCount++;
            else
            OneCount++;
            int Remaining = totalOnes-OneCount;
            int sum = ZeroCount + Remaining;

            score= Math.max(sum,score);

        }
        return score;

        
    }
}