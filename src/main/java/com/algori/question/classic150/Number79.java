package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number79 {

    public boolean exist(char[][] board, String word) {
        int rowNums = board.length;
        int colNums = board[0].length;
        for(int i = 0; i < rowNums; i++) {
            for(int j = 0; j < colNums; j++) {
                if(dfs(board, word, new boolean[rowNums][colNums], 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] visited, int index, int row, int col) {
        if(row > board.length - 1 || row < 0 || col > board[0].length - 1 || col < 0) {
            return false;
        }
        if(visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        if(index == word.length() - 1) {
            return true;
        }
        // 标记访问
        visited[row][col] = true;

        if(dfs(board, word, visited, index + 1, row - 1, col) || dfs(board, word, visited,
            index + 1, row, col + 1) ||dfs(board, word, visited, index + 1, row + 1, col) || dfs(board, word, visited, index + 1, row, col - 1)) {
            // 取消标记访问
            visited[row][col] = false;
            return true;
        }
        // 取消标记访问
        visited[row][col] = false;
        return false;
    }
}
