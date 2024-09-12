class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      Queue<Pair> q = new LinkedList<>();
      int vis[][]= new int[n][m];
      int cntFresh =0;
      for(int i=0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j,0));
                vis[i][j]=2;
            }
            else {
                vis[i][j] =0;
            }
            if(grid[i][j]==1)cntFresh++;
        }
      }
      int tm =0,cnt=0;
      int[] dr = {-1,0,1,0};
      int[] dc ={0,1,0,-1};
      while(!q.isEmpty()){
        int r = q.peek().row;
        int c = q.peek().col;
        int t = q.peek().tm;
         tm = Math.max(tm,t);
        q.remove();
        for(int i=0;i<4;i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr >= 0 && nr < n &&  nc >= 0 && nc <m && vis[nr][nc] ==0 && grid[nr][nc]==1){
                q.add(new Pair(nr,nc,t+1));
                vis[nr][nc]=2;
                cnt++;
            }
        }
      
      }
      if(cnt != cntFresh)return -1;
      return tm;  
    }
}