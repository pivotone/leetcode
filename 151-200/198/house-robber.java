// 计算到与当前位置相距一格时停止
// 状态转化方程为dp[i] = Math.max(dp[j] + nums[i], dp[i])

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int res = nums[0];
        for(int i = 0; i < nums.length; ++i) {
            dp[i] = nums[i];
            for(int j = 0; j < i - 1; ++j) {
                dp[i] = Math.max(dp[j] + nums[i], dp[i]);
            }
            res = Math.max(dp[i], res);
        }

        return res;
    }
}
