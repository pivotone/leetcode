// 位运算，最后两位是11就+1，不是就-1

class Solution {
    public int integerReplacement(int n) {
        int result = 0;
        long x = n;
        while(x != 1) {
            if((x & 1) == 0) x /= 2;
            else {
                x = ((x & 3) == 3 && x != 3) ? x + 1 : x - 1;
            }
            result++;
        }

        return result;
    }
}
