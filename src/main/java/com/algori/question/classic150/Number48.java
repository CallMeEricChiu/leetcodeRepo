package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number48 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Number48 number48 = new Number48();
        number48.rotate(matrix);
        System.out.println(matrix);
    }
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 主对角线置换
        for(int i = 0; i < length; i++) {
            for(int j = i; j < length; j++) {
                exchange(matrix, i, j, j, i);
            }
        }
        // 中心线置换
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length / 2; j++) {
                exchange(matrix, i, j, i, length - 1 -j);
            }
        }
    }

    public void exchange(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}
