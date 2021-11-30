// 纯数学计算

class Solution {
    public int findNthDigit(int n) {
        if(n <= 9) return n;
        int result = 0;
        long j = 9;
        for(int i = 1; ; i++, j *= 10) {
            if(n <= i * j) {
                int num = (int)Math.pow(10, i - 1);
                int count = n / i;
                int pos = n - (count * i);
                if(pos == 0) result = (num + count - 1) % 10;
                else {
                    int sum = num + count;
                    while(pos != 0) {
                        pos--;
                        result = (sum / num);
                        sum %= num;
                        num /= 10;
                    }
                }
                break;
            }
            n -= (i * j);
        }
        return result;
    }
}
