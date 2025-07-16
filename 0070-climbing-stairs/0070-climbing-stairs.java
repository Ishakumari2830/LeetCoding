class Solution {
    public int climbStairs(int n) {
    //recursive --> will give TLE
    // if(n == 0)return 1;
    // if(n == 1)return 1;
    // int left = climbStairs(n-1);//1 step
    // int right = climbStairs(n-2);//2 step
    // return left + right ;
    

    //Memoization -> TLE
    // int[] t = new int[n+1];
    // for(int i = 0;i<n+1;i++){
    //     t[i] = -1;
    // }
    // if(n <= 1)return 1;
    // if(t[n] != -1){
    //     return t[n];
        
    // }
    // return t[n] = climbStairs(n-1) + climbStairs(n-2);

    //Tabulation
    int[] t = new int[n+1];
   if(n <= 2)return n;
   t[0] = 1;
   t[1]= 1;
   

    for(int i = 2;i <= n;i++){
        t[i] = t[i-1] + t[i-2];
    }
    return t[n];


    }
}