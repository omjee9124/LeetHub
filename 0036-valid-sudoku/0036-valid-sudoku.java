class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                boolean A = isRowValid(i, j, board);
                boolean B = isColValid(i, j, board);

                int C = (i / 3) * 3;
                int D = (j / 3) * 3;

                boolean E = isBoxValid(i, j, C, D, board);

                if (!A || !B || !E) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean isRowValid(int i, int j, char[][] board) {

        int count = 0;

        for (int k = 0; k < 9; k++) {

            if (board[i][k] == board[i][j] && board[i][k] != '.') {
                count++;

                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean isColValid(int i, int j, char[][] board) {

        int count = 0;

        for (int k = 0; k < 9; k++) {

            if (board[k][j] == board[i][j] && board[k][j] != '.') {
                count++;

                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean isBoxValid(int i, int j, int C, int D, char[][] board) {

        int count = 0;

        for (int k = C; k < C + 3; k++) {
            for (int l = D; l < D + 3; l++) {

                if (board[k][l] == board[i][j] && board[k][l] != '.') {
                    count++;

                    if (count > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}