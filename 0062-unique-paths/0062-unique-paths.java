class Solution {
    int f(int i , int j,int m ,int n, int[][] t){
       if(i== m && j == n)return 1;
       if(i>m || j > n )return 0;
       if(t[i][j] != -1)return t[i][j];
       int right = f(i,j+1,m,n,t);
       int down = f(i+1,j ,m,n,t);
       t[i][j]= right + down;
       return t[i][j];
       
   }
    public int uniquePaths(int m, int n) {
        int[][] t = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                t[i][j]=-1;
            }

        }
         return f(0,0,m-1,n-1,t);
    }
}