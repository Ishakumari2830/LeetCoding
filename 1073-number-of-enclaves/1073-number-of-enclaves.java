class Pair{
    int first;
    int sec;
    Pair(int first,int sec){
        this.first = first ;
        this.sec = sec;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==m-1 || j == n-1){
                    if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    vis[i][j]=1;
                    }
                }
            }
        }
        int[] dr ={-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().sec;
            q.remove();
           for(int i=0;i<4;i++){
             int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr>=0 &&nr < m && nc >=0 && nc < n && grid[nr][nc]==1 &&vis[nr][nc]==0){
                q.add(new Pair(nr,nc));
                vis[nr][nc]=1;
            }
           }
        } 
        int cnt =0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n ;j++){
                if(grid[i][j]==1 && vis[i][j] ==0){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}