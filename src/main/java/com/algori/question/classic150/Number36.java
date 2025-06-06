package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number36 {

    public boolean isValidSudoku(char[][] board) {
        int[][] cols = new int[9][9];
        int[][] rows = new int[9][9];
        int[][][] subboxes = new int[3][3][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.') {
                    int index = c - '0' - 1;
                    rows[i][index]++;
                    cols[j][index]++;
                    subboxes[i / 3][j / 3][index]++;
                    if(rows[i][index] > 1 || cols[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
