class Solution {
    int[][] dp;

    int lcsAscii(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length())
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = s1.charAt(i) + lcsAscii(s1, s2, i + 1, j + 1);
        } else {
            dp[i][j] = Math.max(
                lcsAscii(s1, s2, i + 1, j),
                lcsAscii(s1, s2, i, j + 1)
            );
        }

        return dp[i][j];
    }
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        dp = new int[n][m];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int sum1 = 0, sum2 = 0;
        for (char c : s1.toCharArray()) sum1 += c;
        for (char c : s2.toCharArray()) sum2 += c;

        int common = lcsAscii(s1, s2, 0, 0);

        return (sum1 + sum2) - 2 * common;
    }
}