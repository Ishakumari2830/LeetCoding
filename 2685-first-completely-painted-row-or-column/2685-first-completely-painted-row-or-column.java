
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> mpp = new HashMap<>();
        
        int m = mat.length;
        int n = mat[0].length;
        int[] x = new int[m];
        int[] y = new int[n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                mpp.put(mat[i][j],new int[]{i,j});
            }
        }

        for(int i = 0;i<arr.length;i++){
           int num = arr[i];
           int[] pos = mpp.get(num);
           int row = pos[0];
           int col = pos[1];
           x[row]++;
           y[col]++;


           if(x[row]==n||y[col]==m)return i;

        }
        return -1;
    }
}