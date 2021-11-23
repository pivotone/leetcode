// 注意判断整体字符串是否相同，很关键

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int[] hash = new int[26];
        int diff1 = -1, diff2 = -1;
        boolean flag = false;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) != goal.charAt(i)){
                if(diff1 == -1) {
                    diff1 = i;
                    continue;
                }
                if(diff2 == -1) {
                    diff2 = i;
                    continue;
                }
                return false;
            }
                
            else {
                if(++hash[s.charAt(i) - 'a'] >= 2) 
                    flag = true;
            }
        }

        return (diff1 != -1 && diff2 != -1 && s.charAt(diff1) == goal.charAt(diff2) && goal.charAt(diff1) == s.charAt(diff2)) || (diff1 == -1 && flag);
    }
}
