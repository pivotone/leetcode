// 做两遍dp

class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int res = nums[0];
        for(int i = 0; i < len - 1; ++i) {
            dp[i] = nums[i];
            for(int j = 0; j < i - 1; ++j) {
                dp[i] = Math.max(dp[j] + nums[i], dp[i]);
            }
            res = Math.max(dp[i], res);
        }
        for(int i = 1; i < len; ++i) {
            dp[i] = nums[i];
            for(int j = 1; j < i - 1; ++j) {
                dp[i] = Math.max(dp[j] + nums[i], dp[i]);
            }
            res = Math.max(dp[i], res);
        }

        return res;
    }
}
