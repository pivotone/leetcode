// 简单的暴力

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] a2b = new int[n + 1];
        int[] b2a = new int[n + 1];
        for(int i = 0; i < trust.length; ++i) {
            a2b[trust[i][0]]++;
            b2a[trust[i][1]]++;
        }
        for(int i = 1; i <= n; ++i) {
            if(a2b[i] == 0 && b2a[i] == n - 1)
                return i;
        }

        return -1;
    }
}
