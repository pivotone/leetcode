// 简单排序

class Solution {
    public String[] findRelativeRanks(int[] score) {
        // int[][] s = new int[score.length][2];
        // for(int i = 0; i < score.length; ++i) {
        //     s[i][0] = score[i];
        //     s[i][1] = i + 1;
        // }
        // Arrays.sort(s, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a, int[] b){
        //         return b[0] - a[0]; 
        //     }
        // });
        // for(int i = 0; i < score.length; ++i) {
        //     s[i][0] = i + 1;
        // }
        // Arrays.sort(s, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a, int[] b){
        //         return a[1] - b[1]; 
        //     }
        // });
        int[] s = score.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(score);
        for(int i = score.length - 1, j = 1; i >= 0; --i, ++j) {
            map.put(score[i], j);
        }

        String[] res = new String[score.length];
        for(int i = 0; i < score.length; ++i) {
            if(map.get(s[i]) == 1) res[i] = "Gold Medal";
            else if(map.get(s[i]) == 2) res[i] = "Silver Medal";
            else if(map.get(s[i]) == 3) res[i] = "Bronze Medal";
            else res[i] = map.get(s[i]).toString();
        }

        return res;
    }
}
