class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        int n = grid.length; 

    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mpp.put(grid[i][j], mpp.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (mpp.containsKey(i)) {
                if (mpp.get(i) == 2) ans[0] = i; 
            } else {
                ans[1] = i; 
            }
        }

        return ans;
    }
}