class Solution {

    private void preprocess(
        int numC,
        int[][] prereq,Map<Integer,List<Integer>> adjList, boolean[][] isPrereq
    ){
        for(int i = 0;i<numC ;i++){
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);

            while(!q.isEmpty()){
                int node = q.poll();

                for(int adj : adjList.getOrDefault(node, new ArrayList<>())){
                    if(!isPrereq[i][adj]){
                        isPrereq[i][adj]= true;
                        q.offer(adj);
                    }
                }
            }
        }
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer,List<Integer>> adjList = new HashMap<>();

        for(int[] edge : prerequisites){
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }

        boolean[][] isPrereq = new boolean[numCourses][numCourses];
        preprocess(numCourses,prerequisites,adjList, isPrereq);

        List<Boolean> ans = new ArrayList<>();

        for(int[] query : queries){
            ans.add(isPrereq[query[0]][query[1]]);
        }
        return ans;
    }
}