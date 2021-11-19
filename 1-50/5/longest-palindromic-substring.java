class Solution {
    public String longestPalindrome(String s) {
        // dp
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLen = 1, start = 0, end = 0;
        for(int r = 1; r < s.length(); ++r) {
            for(int l = 0; l < r; ++l) {
                if(s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if(r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        start = l;
                        end = r;
                    } 
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
