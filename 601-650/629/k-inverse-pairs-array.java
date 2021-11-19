class Solution {
    public int kInversePairs(int n, int k) {
        int mod = 1000000007;
        int[][] dp = new int[n + 1][k + 1];
        for(int i = 1; i <= n; ++i) {
            dp[i][0] = 1;
            for(int j = 1; j <= Math.min(k, sum(i)); ++j) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
                if(j >= i) dp[i][j] = (dp[i][j] + mod - dp[i - 1][j - i]) % mod;
            }
        }
            
                
        
        return dp[n][k];
    }

    public int sum(int n) {
        int num = 0;
        for(int i = 0; i < n; ++i) {
            num += i;
        }

        return num;
    }
  
  // 快
    final int mod = 1000000007;

    public int kInversePairs(int n, int k) {
        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= n; ++ i) {
            long sum = 0;
            for (int j = 0; j <= k; ++ j) {
                sum += dp[i - 1][j];
                if (j + 1 > i) sum -= dp[i - 1][j - i];
                dp[i][j] = (dp[i][j] + sum) % mod;
            }
        }

        return (int) (dp[n][k]);
    }
}
