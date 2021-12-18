// 题目特殊，不需要dfs

class Solution {
    public int countBattleships(char[][] board) {
        int xLen = board.length;
        int yLen = board[0].length;
        int res = 0;
        for(int i = 0; i < xLen; ++i) 
            for(int j = 0; j < yLen; ++j) {
                if(board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] =='.')) {
                    res++;
                }
            }
        
        return res;
    }
}
