class Solution {
    public int reverse(int x) {
        long rev  = 0;
        int y = x > 0 ? x : -x;
        while(y != 0) {
            rev = rev * 10 + (y % 10);
            y /= 10;
        }
        if(x < 0) rev = -rev;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int)rev;
    }
}
