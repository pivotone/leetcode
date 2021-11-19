// 简单计算46341 为int 平方数的开根数值上限

class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num >= 46341 ? 46341 : num;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(mid * mid == num) return true;
            else if(mid * mid < num) l = mid + 1;
            else r = mid - 1;
        }

        return false;
    }
}
