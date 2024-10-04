class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i =0;i < numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            int course = pre[0];
            int precourse = pre[1];
            adj.get(precourse).add(course);
            indegree[course]++;
        
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] ans = new int[numCourses];
        int index =0;
        while(!q.isEmpty()){
            int currCourse = q.poll();
            ans[index]= currCourse;
            index++;
            for(int neighbor : adj.get(currCourse)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    q.add(neighbor);
                }
            }

        
        }
        if(index == numCourses)return ans;
        else return new int[0];
    }
}