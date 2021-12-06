// 注意转台转移方程即可 dp[i] = Math.max(dp[i - 2] + bu[i] * i, dp[i - 1])，当数为i时不需要考虑i + 1

class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0, len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        for(int i = 0; i < len; ++i) max = Math.max(max, nums[i]);
        int[] dp = new int[max + 1];
        int[] bu = new int[max + 1];
        for(int i = 0; i < len; ++i) {
            bu[nums[i]]++;
        }
        dp[1] = bu[1];
        for(int i = 2; i < max + 1; ++i) {
            dp[i] = Math.max(dp[i - 2] + bu[i] * i, dp[i - 1]);
        }
        return dp[max];
    }
}
