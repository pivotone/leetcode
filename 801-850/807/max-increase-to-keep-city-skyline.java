// 暴力

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row = grid.length;
        int[] rowMax = new int[row];
        int[] colMax = new int[row];
        for(int i = 0; i < row; ++i) {
            for(int j = 0; j < row; ++j)
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            for(int j = 0; j < row; ++j)
                colMax[i] = Math.max(colMax[i], grid[j][i]); 
        }
        int result = 0;
        for(int i = 0; i < row; ++i)
            for(int j = 0; j < row; ++j)
                result += (Math.min(colMax[j], rowMax[i]) - grid[i][j]);
        
        return result;
    }
}
