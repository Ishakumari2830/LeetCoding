class Solution {
    public int findJudge(int n, int[][] trust) {
       if (n == 1) return 1;

        // Create arrays to track how many people trust each person and how many they trust
        int[] trustCount = new int[n + 1];
        int[] trustedByOthers = new int[n + 1];
        
        // Fill the arrays based on trust relationships
        for (int[] t : trust) {
            int a = t[0]; // Person who trusts
            int b = t[1]; // Person who is trusted

            trustCount[a]++;    // a trusts someone, so increment their trust count
            trustedByOthers[b]++; // b is trusted by someone, so increment their trustedByOthers count
        }
        
        // Find the person who is trusted by n-1 people and trusts no one
        for (int i = 1; i <= n; i++) {
            if (trustedByOthers[i] == n - 1 && trustCount[i] == 0) {
                return i;
            }
        }
        
        // If no judge is found, return -1
        return -1;
    }
}