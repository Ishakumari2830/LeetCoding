class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];

        for(int i =0;i<n;i++){
            inDegree[favorite[i]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
        int[] dth = new int[n];
        Arrays.fill(dth,1);

        while(!q.isEmpty()){
            int curr = q.poll();
            int next = favorite[curr];
            dth[next]= Math.max(dth[next], dth[curr]+1);
            if(--inDegree[next]==0){
                q.offer(next);
            }
        }

        int longCycle = 0;
        int twoCycle = 0;
        for(int i = 0;i<n;i++){
            if(inDegree[i]==0)continue;

            int len = 0;
            int curr = i;
            while(inDegree[curr] != 0){
                inDegree[curr] = 0;
                len++;
                curr= favorite[curr];
            }

            if(len == 2){
                twoCycle += dth[i] + dth[favorite[i]];
            } else {
                longCycle = Math.max(longCycle ,len);
            }
        }
        return Math.max(longCycle, twoCycle);
    }
}