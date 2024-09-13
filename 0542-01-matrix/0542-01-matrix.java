class Pair{
    int first;
    int sec;
    int third;
    Pair(int first,int sec,int third){
        this.first = first;
        this.sec = sec;
        this.third = third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int vis[][] = new int[m][n];
        int dist[][] = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]= 1;
                }
                else {
                    vis[i][j]=0;
                }
            }
        }
        int[] dR = {-1,0,1,0};
        int[] dC = {0,1,0,-1};
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().sec;
            int step = q.peek().third;
            q.remove();
            dist[r][c]=step;
            for(int i=0;i<4;i++){
                int nr = r+ dR[i];
                int nc = c + dC[i];
                if(nr>=0 && nr < m && nc>=0 && nc<n && vis[nr][nc]==0 ){
                    vis[nr][nc]=1;
                    q.add(new Pair(nr, nc, step+1));
                }
            }
        }
        return dist;
    }
}