class Solution {
    static public boolean solve(int x, int y, int[][] mat) {
        int[] sum = new int[3];
        int[] sumcol = new int[3];
        boolean[] arr = new boolean[10]; // to track numbers between 1 to 9

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // row sum
                sum[i] += mat[x + i][y + j];
                // column sum
                sumcol[j] += mat[x + i][y + j];

                // Must have values between 1 to 9 and must be unique
                if (mat[x + i][y + j] > 9 || mat[x + i][y + j] == 0 || arr[mat[x + i][y + j]]) {
                    return false;
                }
                arr[mat[x + i][y + j]] = true;
            }
        }

        // Row sum must be equal to Column sum
        for (int i = 1; i < 3; i++) {
            if (sum[i] != sum[i - 1] || sum[i] != sumcol[i] || sumcol[i] != sumcol[i - 1]) {
                return false;
            }
        }

        // Diagonals sum must be equal and equal to any of the row or column sum
        int dig1 = mat[x][y] + mat[x + 1][y + 1] + mat[x + 2][y + 2];
        int dig2 = mat[x][y + 2] + mat[x + 1][y + 1] + mat[x + 2][y];
        if (dig1 != dig2 || dig1 != sum[0]) {
            return false;
        }

        return true;
    }

    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        int rows = grid.length;
        int col = grid[0].length;

        if (rows < 3 || col < 3) return 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= col - 3; j++) {
                if (solve(i, j, grid)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
