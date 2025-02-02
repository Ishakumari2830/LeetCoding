class Solution {
    public int maxDistance(String s, int k) {
         int ans = 0;
         char[] horizontal = {'E', 'W'};
         char[] vertical = {'N', 'S'};
         for(char hori: horizontal){
            for(char ver : vertical){
                int remainK = k,netX = 0,netY = 0;
                for(char ch : s.toCharArray()){
                    if(ch == hori && remainK > 0){
                        ch = (ch=='W') ? 'E' : 'W';
                        remainK--;
                    }
                    else  if(ch == ver && remainK > 0){
                        ch = (ch=='N') ? 'S' : 'N';
                        remainK--;
                    }
                    if (ch == 'E') netX++;
                    if (ch == 'W') netX--;
                    if (ch == 'N') netY++;
                    if (ch == 'S') netY--;

                    ans = Math.max(ans, Math.abs(netX) + Math.abs(netY));

                }
               
            }
         }
     return ans;

    }
}