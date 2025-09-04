class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    boolean firstRowImpacted = false;
    boolean firstColImpacted = false;
    //check first row is imapcted or not
      for(int col = 0;col < n;col++){
        if(matrix[0][col] == 0){
           firstRowImpacted = true;
           break;
        }
      }
    //check first col is impacted or not
     for(int row = 0;row < m;row++){
        if(matrix[row][0] == 0){
           firstColImpacted = true;
           break;
        }
      }

      //set mark in first col /row
      for(int i = 1;i<m;i++){
        for(int j = 1;j<n;j++){
            if(matrix[i][j]==0){
                matrix[i][0]=0;
                matrix[0][j]= 0;
            }
        }
      }

       for(int i = 1;i<m;i++){
        for(int j = 1;j<n;j++){
            if(matrix[i][0]==0 ||matrix[0][j]==0){
               matrix[i][j]= 0;
            }
        }
      }

      if(firstRowImpacted){
        for(int j = 0;j<n;j++){
            matrix[0][j]=0;
        }
      }
      if(firstColImpacted){
        for(int i = 0;i<m;i++){
            matrix[i][0]= 0;
        }
      }
    }
}