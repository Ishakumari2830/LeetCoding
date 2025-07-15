class Solution {
    public int fib(int n) {
        int[] t = new int[n+1];
        for(int i = 0;i<n+1;i++){
            t[i] = -1;
        
        }
        if(n <=1)return n;
        if( t[n] != -1){
            return t[n];
        }
        return t[n] = fib(n-1) + fib(n-2);
    }
}