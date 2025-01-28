class Solution {
    private int dfs( int[][] grid,boolean[][] vis, int row, int col){
        if(row < 0 || row >= grid.length || col <0 || col >= grid[0].length || grid[row][col]==0 || vis[row][col]){
            return 0;
        }
        vis[row][col] = true;

        return (grid[row][col] + dfs(grid,vis,row,col+1)+dfs(grid,vis,row,col-1)+dfs(grid,vis,row+1,col)+dfs(grid,vis,row-1,col));
    }
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxcnt= 0;

        boolean[][] vis = new boolean[rows][cols];

        for(int row = 0; row < rows;row++){
            for(int col = 0;col < cols;col++){
                maxcnt = Math.max(maxcnt,dfs(grid,vis,row,col));
            }
        }

        return maxcnt;
    }
}