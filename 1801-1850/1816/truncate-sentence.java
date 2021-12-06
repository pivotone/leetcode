// 记录空格出现次数， 对String进行裁切

class Solution {
    public String truncateSentence(String s, int k) {
        int numOfBlank = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == ' ') {
                if(++numOfBlank == k)
                    s = s.substring(0, i);
            }
        }

        return s;
    }
}
