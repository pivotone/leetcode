class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int result = 1, axios = points[0][1];
        for(int i = 1; i < points.length; ++i) {
            if(points[i][0] <= axios) continue;
            else {
                axios = points[i][1];
                result++;
            }
        }

        return result;
    }
}
