class Solution {
    long mod = (long) 1e9 + 7;
    public int maximumXorProduct(long a, long b, int n) {
         long xXora = 0, xXorb = 0;

      
        for (long i = 49; i >= n; i--) {
            boolean a_ith_bit = ((a >> i) & 1) > 0; 
            boolean b_ith_bit = ((b >> i) & 1) > 0; 

            if (a_ith_bit) {
                xXora = xXora ^ (1L << i); 
            }
            if (b_ith_bit) {
                xXorb = xXorb ^ (1L << i);
            }
        }

      
        for (long i = n - 1; i >= 0; i--) {
            boolean a_ith_bit = ((a >> i) & 1) > 0; 
            boolean b_ith_bit = ((b >> i) & 1) > 0; 

            if (a_ith_bit == b_ith_bit) {
                
                xXora = xXora ^ (1L << i);
                xXorb = xXorb ^ (1L << i);
            } else if (xXora > xXorb) {
                xXorb = xXorb ^ (1L << i); 
            } else {
                xXora = xXora ^ (1L << i); 
            }
        }

    
        xXora = xXora % mod;
        xXorb = xXorb % mod;

      
        return (int) ((xXora * xXorb) % mod);
    }
}