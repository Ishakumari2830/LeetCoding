class Solution {
    public void dfs(int r,int c,int[][] vis,char[][] board,int[] dr,int[] dc){
        int n = board.length;
        int m = board[0].length;
        vis[r][c]=1;
        for(int i =0;i<4;i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr>=0 && nr < n && nc >=0 && nc < m && vis[nr][nc] ==0 && board[nr][nc]=='O'){
                
                dfs(nr,nc,vis,board,dr,dc);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int vis[][] = new int[n][m];
        int[] dr = {-1,0,1,0};
        int[] cr = {0,1,0,-1};
        //traverse the first and last row
        for(int j =0;j<m;j++){
            if(vis[0][j]==0 && board[0][j]=='O'){
                dfs(0,j,vis,board,dr,cr);
            }
             if(vis[n-1][j]==0 && board[n-1][j]=='O'){
                dfs(n-1,j,vis,board,dr,cr);
            }
        }
        //taverse the first and last col
         for(int i =0;i<n;i++){
            if(vis[i][0]==0 && board[i][0]=='O'){
                dfs(i,0,vis,board,dr,cr);
            }
             if(vis[i][m-1]==0 && board[i][m-1]=='O'){
                dfs(i,m-1,vis,board,dr,cr);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }
}