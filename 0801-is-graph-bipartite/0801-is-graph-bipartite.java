class Solution {
    public boolean checkBipartite(int i,ArrayList<ArrayList<Integer>>adj,int color[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        color[i]=0;

        while(!q.isEmpty()){
            int node=q.poll();
            
            for(int e:adj.get(node)){
                if(color[e]==-1){// if the adjacent node is yet not colored
                    color[e]=1-color[node];// you will give the opposite color of the node 
                    q.add(e);
                }
                else if(color[e]==color[node]){// is the adjacent guy having the same color 
                    return false;
                }
            }
            
        }
        return true;

    }

    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        
        int color[]=new int[n+1];
        Arrays.fill(color,-1);

        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(checkBipartite(i,adj,color)==false){
                    return false;
                }
            }
        }
        return true;
    
    }
}