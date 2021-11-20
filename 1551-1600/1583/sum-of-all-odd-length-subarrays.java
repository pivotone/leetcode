// 排列组合每个数左右区间的奇偶区间个数就可以了

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int result = 0;
        for(int i = 0; i < len; ++i) {
            result += (arr[i] * (((i  + 1) / 2) * ((len - i) / 2) + ((len - i - 1) / 2 + 1) * (i / 2 + 1)));
        }

        return result;
    }
}
