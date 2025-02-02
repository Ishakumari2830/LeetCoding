class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a,b)->a[0]-b[0]);
       List<int[]> ans = new ArrayList<>();

       ans.add(intervals[0]);

       for(int  i =1;i<intervals.length;i++){
        int start = intervals[i][0];
        int end = intervals[i][1];

        int[] prev = ans.get(ans.size()-1);

        if(start > prev[1]){
            ans.add(intervals[i]);
        }
        else {
            prev[1]= Math.max(prev[1],end);
        }
       }
       return ans.toArray(new int[ans.size()][]);



        
    }
}