class Solution {
    public int minimumDeletions(String s) {
      int bCount = 0;
        int cnt = 0;

        for(char c : s.toCharArray()) {
            if(c == 'b'){
                bCount++;
            } else {
                cnt = Math.min(cnt + 1, bCount);
            }
        }
        return cnt;

    }
}