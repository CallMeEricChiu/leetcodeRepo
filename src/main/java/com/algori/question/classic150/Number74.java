package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number74 {

    public static void main(String[] args) {
        Number74 number74 = new Number74();
        boolean b = number74.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13);
        System.out.println(b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findRow(matrix, target, 0, matrix.length - 1);
        return findTarget(matrix[row], target, 0, matrix[row].length - 1);
    }

    private int findRow(int[][] matrix, int target, int i, int j) {
        if(i >= j) {
            return i;
        }
        int mid = (i + j) / 2;
        if(matrix[mid][0] > target) {
            return findRow(matrix, target, i, mid - 1);
        } else if(matrix[mid][matrix[mid].length - 1] < target) {
            return findRow(matrix, target, mid + 1, j);
        } else {
            return mid;
        }
    }

    private boolean findTarget(int[] nums, int target, int i, int j) {
        if(i >= j) {
            return nums[i] == target;
        }
        int mid = (i + j) / 2;
        if(nums[mid] < target) {
            return findTarget(nums, target, mid + 1, j);
        } else if(nums[mid] > target) {
            return findTarget(nums, target, i, mid - 1);
        } else {
            return true;
        }
    }
}
