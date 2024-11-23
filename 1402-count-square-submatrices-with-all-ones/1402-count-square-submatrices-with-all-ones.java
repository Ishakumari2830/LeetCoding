class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] t = new int[r][c];
        for(int j =0;j<c;j++)t[0][j]= matrix[0][j];
        for(int i =0;i<r;i++)t[i][0]= matrix[i][0];

       
        for(int i = 1;i<r;i++){
            for(int j = 1;j<c;j++){
                if(matrix[i][j]==0)t[i][j]=0;
                else
               
                t[i][j] =1+ Math.min(t[i-1][j],Math.min(t[i-1][j-1],t[i][j-1]));
            }
        }
        int sum =0;
         for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
             sum += t[i][j];
            }
        }
        return sum;

    }
}