// 简单dp

class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            result = Math.max(dp[i], result);
        }

        return result;  
    }
}
