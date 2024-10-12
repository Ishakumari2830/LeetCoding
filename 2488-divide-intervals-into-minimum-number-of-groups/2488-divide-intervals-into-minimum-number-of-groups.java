class Solution {
    
    public int minGroups(int[][] intervals) {
         List<int[]> events = new ArrayList<>();
        
        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], 1});  
            events.add(new int[]{interval[1] + 1, -1}); 
        }
        
        
        Collections.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        
        int maxGroups = 0;
        int activeGroups = 0;
        
        for (int[] event : events) {
            activeGroups += event[1]; 
            maxGroups = Math.max(maxGroups, activeGroups); 
        }
        
        return maxGroups;
        
    }
}