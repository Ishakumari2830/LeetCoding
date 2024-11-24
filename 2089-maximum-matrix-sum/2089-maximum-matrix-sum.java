class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        long sum = 0;
        int negcnt = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] < 0){
                    negcnt++;
                }
                int absv = Math.abs(matrix[i][j]);
                min = Math.min(min,absv);
                sum += absv;
            }
        }
        if(negcnt % 2 == 0)return sum;

        return sum - 2*min;
    }
}