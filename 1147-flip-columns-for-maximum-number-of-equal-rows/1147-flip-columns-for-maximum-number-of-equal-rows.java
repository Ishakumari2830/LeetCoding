class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int[] row : matrix) {
            StringBuilder bin = new StringBuilder();
            StringBuilder invBin = new StringBuilder();

            for (int val : row) {
                bin.append(val == 0 ? '0' : '1');
                invBin.append(val == 0 ? '1' : '0');
            }

            String binStr = bin.toString();
            String invBinStr = invBin.toString();

            map.put(binStr, map.getOrDefault(binStr, 0) + 1);
            map.put(invBinStr, map.getOrDefault(invBinStr, 0) + 1);

            ans = Math.max(ans, Math.max(map.get(binStr), map.get(invBinStr)));
        }

        return ans;
    }
}