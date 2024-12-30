class Solution {
    
    private int solve(int len, int high, int low, int zero, int one, int mod, int[] t){
        
   
        if(len > high)return 0;
        if(t[len] != -1)return t[len];
       
        int addOne = (len >= low ) ? 1 : 0;//ek toh add krna hi pdega
        int append_one = solve(len + one,high,low,zero,one,mod,t);
        int append_zero = solve(len + zero,high,low,zero,one,mod,t );
        return t[len] =  (addOne + append_one + append_zero) % mod;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod= (int)1e9 + 7;
        int[] t = new int[high+1];

       Arrays.fill(t, -1); 
        return solve(0,high,low,zero,one,mod,t);
    }
}