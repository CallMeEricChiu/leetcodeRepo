package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number73 {

    public void setZeroes(int[][] matrix) {
        boolean col0Flag = false, row0Flag = false;
        for(int[] ints : matrix) {
            if(ints[0] == 0) {
                row0Flag = true;
                break;
            }
        }
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[0][j] == 0) {
                col0Flag = true;
                break;
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[0][j] == 0 || matrix[i][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(col0Flag) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if(row0Flag) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
