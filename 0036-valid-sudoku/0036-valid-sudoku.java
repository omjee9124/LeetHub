class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows[][] = new int[9][9];
        int col[][] = new int[9][9];
        int boxes[][] = new int[9][9];

        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[i][j] == '.') continue;

                int val = board[i][j] - '1';

                if(rows[i][val] == 1){
                    return false;
                }
                rows[i][val] = 1;

                if(col[j][val] == 1){
                    return false;
                }
                col[j][val] = 1;

                int boxidx = 3 * (i/3) + (j/3);
                if(boxes[boxidx][val] == 1){
                    return false;
                }
                boxes[boxidx][val] = 1;
            }
        }
        return true;
    }
}