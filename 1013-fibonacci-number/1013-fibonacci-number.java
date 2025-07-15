class Solution {
    public int fib(int n) {
        //memoization
        // int[] t = new int[n+1];
        // for(int i = 0;i<n+1;i++){
        //     t[i] = -1;
        
        // }
        // if(n <=1)return n;
        // if( t[n] != -1){
        //     return t[n];
        // }
        // return t[n] = fib(n-1) + fib(n-2);

        //tabulation
        int[] t = new int[n+1];
         if (n >= 0) t[0] = 0;
        if (n >= 1) t[1] = 1;
        for(int i = 2;i<n+1;i++){
            t[i] = t[i-1] + t[i-2];
        }
        return t[n];
    }
}