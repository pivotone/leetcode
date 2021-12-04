// 将String 转化为 char数组加快速度

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        for(char ch : r) hash[ch - 'a']++;
        for(char ch : m) hash[ch - 'a']--;
        for(int i = 0; i < 26; ++i)
            if(hash[i] > 0)
                return false;

        return true;
    }
}
