// dfs ，注意判断是否为边界

class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int x = grid.length, y = grid[0].length;
        boolean[][] flag = new boolean[x][y];
        flag[row][col] = true;
        dfs(grid, flag, row, col);
        for(int i = 0; i < x; ++i)
            for(int j = 0; j < y; ++j) {
                if(flag[i][j]) {
                    if(i == 0 || j == 0 || i == x - 1 || j == y - 1) {
                        grid[i][j] = color;
                    }
                    int[] dx = {1, -1, 0, 0};
                    int[] dy = {0, 0, 1, -1};
                    for(int k = 0; k < 4; ++k) {
                        int lx = i + dx[k];
                        int ly = j + dy[k];
                        if(lx < 0 || ly < 0 || lx >= x || ly >= y) continue;
                        if(flag[lx][ly] == false) {
                            grid[i][j] = color;
                            break;
                        }
                    }
                }
            }
                
        
        return grid;
    }

    private void dfs(int[][] grid, boolean[][] flag, int row, int col) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for(int i = 0; i < 4; ++i) {
            int x = row + dx[i];
            int y = col + dy[i];
            if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) continue;
            if(grid[x][y] == grid[row][col] && flag[x][y] == false) {
                flag[x][y] = true;
                dfs(grid, flag, x, y);
            }
        }
    }
}
