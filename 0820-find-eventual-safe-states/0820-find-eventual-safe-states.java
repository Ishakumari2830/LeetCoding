class Solution {
    private boolean dfs(int node,int[] check,int[] vis,int[] pathVis , List<List<Integer>> adj){
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        for(int it : adj.get(node)){
            if(vis[it]==0){
               if(dfs(it,check,vis,pathVis,adj)==true) return true;
            }
            else if(pathVis[it]==1)return true;
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j =0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }

        }
        int vis[] = new int[n];
        int pathVis[] = new int[n];
        int check[] = new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,check,vis,pathVis,adj);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(check[i]==1){
                ans.add(i);

            }
        }
        return ans;
    }
}