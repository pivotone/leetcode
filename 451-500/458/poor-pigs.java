// 多维度

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int maxRound = minutesToTest/minutesToDie+1;
        while(Math.pow(maxRound, pigs) < buckets){
            pigs++;
        }
        return pigs;
    }
}
