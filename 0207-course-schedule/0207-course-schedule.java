class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i< numCourses; i++){
            adj.add(new ArrayList<>());
        }
      
        for(int[] pre :prerequisites ){
            adj.get(pre[1]).add(pre[0]);
        
        }
        boolean vis[] = new boolean[numCourses];
        boolean pathVis[] = new boolean[numCourses];

        for(int i =0;i<numCourses;i++){
            if(isCyclic(i,adj,vis,pathVis))return false;
        }
        return true;

    }
    private boolean isCyclic(int course,List<List<Integer>> adj , boolean vis[],boolean pathVis[]){
        if(pathVis[course])return true;
        if(vis[course])return false;

         pathVis[course] = true;
         vis[course] = true;
        
        // Explore neighbors (adjacent courses)
        for (int neighbor : adj.get(course)) {
            if (isCyclic(neighbor, adj, vis, pathVis)) {
                return true;
            }
        }
        
        // Backtrack, remove from the current path
        pathVis[course] = false;
        
        return false;

    }
}