// dp问题， (m, n)是由(m - 1, n) 和 (m, n - 1)这两种可能性得来。
// 状态转移为 dp[m][n] = dp[m - 1][n] + dp[m][n - 1];

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < n; ++i) dp[0][i] = 1;
        for(int i = 0; i < m; ++i) dp[i][0] = 1;
        for(int i = 1; i < m; ++i) {
            for(int j = 1; j < n; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
