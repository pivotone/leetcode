class Solution {
    public int totalMoney(int n) {
        int first = n / 7;
        int second = n % 7;
        int num1 = 0;
        for(int i = 2; i <= first; ++i) num1 += (i - 1);
        int num2 = first * 28 + num1 * 7;
        for(int i = 1; i <= second; ++i) num2 += (i + first);

        return num2;
    }
}
