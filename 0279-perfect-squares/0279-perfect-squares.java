class Solution {
    
    private int rec(int n ,int[] t){
        if(n== 0)return 0;
        if(t[n] != -1)return t[n];

        int mini = Integer.MAX_VALUE;
        for(int i = 1;i*i <= n;i++){
            int sq = i*i;
            int res = rec(n-sq,t);
            
            mini = Math.min(mini,1 + res);
            
        }
        return t[n] = mini;


    }
    public int numSquares(int n) {
        //recursion
        // if(n== 0)return 0;
        // int mini = Integer.MAX_VALUE;
        // for(int i = 1;i*i<=n;i++){
        //     int sq = i*i;
        //     int res = numSquares(n-sq);
        //     if(res !=  Integer.MAX_VALUE){
        //         mini = Math.min(mini,res + 1);
        //     }

        // }
        // return mini;

        //memoization
        int[] t = new int[n+1];
        Arrays.fill(t,-1);
        
        return rec(n,t);

    }
}