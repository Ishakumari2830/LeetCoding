class Solution {
   
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)return 0;
         Arrays.sort(intervals, (v1,v2)-> Integer.compare(v1[1],v2[1]));
         int cnt =1;
        int lastEndTime = intervals[0][1];
         for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastEndTime){
                cnt++;
                lastEndTime = intervals[i][1];

            }
         }
         return intervals.length - cnt;
    }
}