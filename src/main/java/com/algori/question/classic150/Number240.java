package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target, 0, matrix[0].length - 1);

    }

    private boolean search(int[][] matrix, int target, int i, int j) {
        if(i >= matrix.length || j < 0) {
            return false;
        }
        if(matrix[i][j] == target) {
            return true;
        } else if(matrix[i][j] > target) {
            return search(matrix, target, i, j - 1);
        } else {
            return search(matrix, target, i + 1, j);
        }
    }
}
