class Pair{
    int first;
    int sec;
    public Pair(int first,int sec){
        this.first = first;
        this.sec = sec;
    }

}

class Solution {
    public void bfs(int ro,int co,int[][] vis,char[][] grid){
        vis[ro][co] = 1; // Mark the current cell as visited.
        Queue<Pair> q = new LinkedList<>(); // Create a queue for BFS.
        q.add(new Pair(ro, co)); // Add the starting cell to the queue.

        int n = grid.length;
        int m = grid[0].length;

        // Define directions for 4-connected neighbors (up, down, left, right).
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        // Process all cells in the queue (BFS).
        while (!q.isEmpty()) {
            Pair p = q.remove();
            int row = p.first;
            int col = p.sec;

            // Check all 4 possible directions.
            for (int i = 0; i < 4; i++) {
                int nrow = row + dRow[i];
                int ncol = col + dCol[i];

                // If the new cell is within bounds, is land ('1'), and is not visited.
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1; // Mark the new cell as visited.
                    q.add(new Pair(nrow, ncol)); // Add it to the queue for further exploration.
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
         int n = grid.length;  // Number of rows.
        int m = grid[0].length;  // Number of columns.
        int[][] vis = new int[n][m]; // Visited array to track visited cells.
        int cnt = 0; // Island counter.

        // Loop through each cell in the grid.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {  // Fixed: should be "c < m", iterating over columns.
                // If the cell is land ('1') and has not been visited, start a BFS.
                if (vis[r][c] == 0 && grid[r][c] == '1') {
                    cnt++; // Increment island count.
                    bfs(r, c, vis, grid); // Start BFS from this cell.
                }
            }
        }
        return cnt; 
    }
}