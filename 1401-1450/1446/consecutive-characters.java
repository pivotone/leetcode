// 记录上一个字符的状态，进行比较即可

class Solution {
    public int maxPower(String s) {
        int pre = 1, now = 1;
        int res = 1;
        for(int i = 1; i < s.length(); ++i) {
            if(s.charAt(i) == s.charAt(i - 1)) now += pre;
            res = Math.max(now, res);
            pre = now;
            now = 1;
        }

        return res;
    }
}
