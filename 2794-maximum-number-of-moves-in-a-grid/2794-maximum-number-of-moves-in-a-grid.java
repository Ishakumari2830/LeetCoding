class Solution {
    public int maxMoves(int[][] grid) {
        int maxr = grid.length-1;
        int maxc = grid[0].length -1 ; 
        int[][] t = new int[maxr + 1][maxc+1];
        for(int[] row : t){
            Arrays.fill(row, -1);
        }
        
        int res = 0;
        for(int i =0;i <= maxr ; i++){
            int tmpres = rec(grid, i, 0, maxr,maxc, t);
            res = Math.max(res,tmpres);
        }
        return res;
    }
    private int rec(int[][] grid,int r, int c, int maxr,int maxc , int[][] t){
        if(r < 0 ||  r > maxr || c > maxc)return 0;
        if(t[r][c] != -1)return t[r][c];
        int diaup = 0, right = 0, diadown = 0;
        if(r-1 >= 0 && c + 1 <= maxc && grid[r-1][c+1] > grid[r][c]){
            diaup = 1 + rec(grid,r-1,c +1,maxr,maxc,t);
        }
         if(c + 1 <= maxc && grid[r][c+1] > grid[r][c]){
            right = 1 + rec(grid,r,c +1,maxr,maxc,t);
        }
         if(r+1 <= maxr && c + 1 <= maxc && grid[r+1][c+1] > grid[r][c]){
            diadown = 1 + rec(grid,r+1,c +1,maxr,maxc,t);
        }
        return t[r][c] = Math.max(diaup, Math.max(right, diadown));


    }
}