// 1. 快速幂
// 2. euler函数 (a^b)%c = (a^(b%phi(c))%c, 可以扩展为(a^b)%c = ((a%c)^(b%phi(c))%c

class Solution {
    public int superPow(int a, int[] b) {
        a %= 1337;
        int exp = 0;
        for(int c : b) {
            exp = (exp * 10 + c) % 1140;
        }
        int res = quick_pow(a, exp);
        return res;
    }
    public int quick_pow(int a, int b) {
        int res = 1;
        while(b > 0) {
            if((b & 1) == 1) 
                res = (res * a) % 1337;
            b >>= 1;
            a = (a * a) % 1337;
        }

        return res;
    }
}
