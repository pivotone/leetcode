// 初始化边界时 遇到障碍物就停止
// 在遍历数组时， 遇到障碍将此处的dp[m][n]设为0
// 状态转移方程为 obstacleGrid[i][j] == 1 ? dp[i][j] = 0 : dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length, m = obstacleGrid.length;
        int[][] dp = new int[m][n];
        int i = 0;
        while(i < n && obstacleGrid[0][i] != 1) dp[0][i++] = 1;
        i = 0;
        while(i < m && obstacleGrid[i][0] != 1) dp[i++][0] = 1;
        for(i = 1; i < m; ++i) {
            for(int j = 1; j < n; ++j) {
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
