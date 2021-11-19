// 位运算，将“a-z”映射到位1-26上
// 当两数做& 运算是结果为0 则证明没有重复，取最大值。

class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int[] hash = new int[len];
        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < words[i].length(); ++j) {
                hash[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int result = 0;

        for(int i = 1; i < len; ++i) {
            for(int j = 0; j < i; ++j) {
                if((hash[i] & hash[j]) == 0) {
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }

        return result;
    }
}
