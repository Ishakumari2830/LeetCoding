class Solution {
    public int largestCombination(int[] candidates) {
       int max = 0;
        
        // Check each bit position from 0 to 31
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int candidate : candidates) {
                // If the current bit is set in this candidate, increase count
                if ((candidate & (1 << bit)) != 0) {
                    count++;
                }
            }
            // Track the maximum count of any bit position
            max = Math.max(max, count);
        }
        
        return max;
    }
}