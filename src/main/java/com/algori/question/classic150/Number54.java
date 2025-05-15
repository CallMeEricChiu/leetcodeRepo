package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number54 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Number54 number54 = new Number54();
        List<Integer> integers = number54.spiralOrder(matrix);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int total = rowNum * colNum;
        int i = 0, j = -1, count = 0;
        List<Integer> res = new ArrayList<>();
        while (count < total) {
            // right
            while(++j < colNum && matrix[i][j] != 999) {
                res.add(matrix[i][j]);
                matrix[i][j] = 999;
                count++;
            }
            j--;
            // down
            while(++i < rowNum && matrix[i][j] != 999) {
                res.add(matrix[i][j]);
                matrix[i][j] = 999;
                count++;
            }
            i--;
            // left
            while(--j >= 0 && matrix[i][j] != 999) {
                res.add(matrix[i][j]);
                matrix[i][j] = 999;
                count++;
            }
            j++;
            // up
            while(--i >= 0 && matrix[i][j] != 999) {
                res.add(matrix[i][j]);
                matrix[i][j] = 999;
                count++;
            }
            i++;
        }
        return res;
    }
}
