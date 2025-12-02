class Solution {
    static final long MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
      Map<Integer, Integer> map = new HashMap<>();
        for (int[] p : points) {
            map.put(p[1], map.getOrDefault(p[1], 0) + 1);
        }

        long sumH = 0, sumH2 = 0;

      
        for (int cnt : map.values()) {
            if (cnt >= 2) {
                long h = (long) cnt * (cnt - 1) / 2;
                h %= MOD;

                sumH = (sumH + h) % MOD;
                sumH2 = (sumH2 + (h * h) % MOD) % MOD;
            }
        }

       
        long result = (sumH * sumH % MOD - sumH2 + MOD) % MOD;

       
        long inv2 = (MOD + 1) / 2;  
        result = result * inv2 % MOD;

        return (int) result;   
    }
}