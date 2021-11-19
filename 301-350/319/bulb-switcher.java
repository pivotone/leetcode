// 只有平方数会被保留

class Solution {
    public int bulbSwitch(int n) {
        int r = 0;
        for(int i = 1; i * i <= n; ++i) r++;
        return r;
    }
}
