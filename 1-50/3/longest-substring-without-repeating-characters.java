// 只需记录上一次出现的位置即可完成解答

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        for(int i = 0; i < 128; ++i) chars[i] = -1;
        int result = 0, start = 0;
        for(int i = 0; i < s.length(); ++i) {
            int pos = s.charAt(i);
            start = Math.max(start, chars[pos] + 1);
            result = Math.max(result, i - start + 1);
            chars[pos] = i;
        }
        return result;
    }
}
