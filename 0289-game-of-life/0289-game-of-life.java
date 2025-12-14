class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] copy = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j< cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {

                int live = countLiveNeighbor(copy, i, j);

                if(copy[i][j] == 1) {
                    if (live < 2 || live > 3) {
                        board[i][j] = 0;
                    }
                } 
                
                if(copy[i][j] == 0) {
                    if (live == 3) {
                        board[i][j] = 1;
                    }
                } 
            }
        }

    }

    static int countLiveNeighbor(int[][] board, int r, int c) {
        int count = 0;
        int rows = board.length;
        int cols = board[0].length;

        if (r - 1 >= 0 && c - 1 >= 0 && board[r - 1][c - 1] == 1) {
            count++;
        }
        if (r - 1 >= 0 && board[r - 1][c] == 1) {
            count++;
        }
        if (r - 1 >= 0 && c + 1 < cols && board[r - 1][c + 1] == 1) {
            count++;
        }

        if (c - 1 >= 0 && board[r][c - 1] == 1) {
            count++;
        }
        if (c + 1 < cols && board[r][c + 1] == 1) {
            count++;
        }

        if (r + 1 < rows && c - 1 >= 0 && board[r + 1][c - 1] == 1) {
            count++;
        }
        if (r + 1 < rows && board[r + 1][c] == 1) {
            count++;
        }
        if (r + 1 < rows && c + 1 < cols && board[r + 1][c + 1] == 1) {
            count++;
        }

        return count;
    }
}

