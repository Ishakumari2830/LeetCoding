class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         List<int[]> res = new ArrayList<>(); // Use ArrayList to dynamically add intervals
        int i = 0;
        int n = intervals.length;  // Use intervals.length to get the number of intervals
        
        // Add all intervals that come before the newInterval (no overlap)
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }
        
        // Merge all overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);  // Use Math.max for end of merged interval
            i++;
        }
        // Add the merged new interval
        res.add(newInterval);
        
        // Add all remaining intervals
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }
        
        // Convert the result list to a 2D array
        return res.toArray(new int[res.size()][]);
    }
}