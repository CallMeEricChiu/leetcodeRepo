package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number695 {

    public static void main(String[] args) {
        int[][] matrix = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        Number695 number695 = new Number695();
        int i = number695.maxAreaOfIsland(matrix);
        System.out.println(i);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int row, int col) {

        int res = 1;
        grid[row][col] = -1;
        // 向上
        if(row - 1 >= 0 && grid[row - 1][col] == 1) {
            int area1 = dfs(grid, row - 1, col);
            res += area1;
        }

        // 向右
        if(col + 1 < grid[0].length && grid[row][col + 1] == 1) {
            int area2 = dfs(grid, row, col + 1);
            res += area2;
        }

        // 向下
        if(row + 1 < grid.length && grid[row + 1][col] == 1) {
            int area3 = dfs(grid, row + 1, col);
            res += area3;
        }

        // 向左
        if(col - 1 >= 0 && grid[row][col - 1] == 1) {
            int area4 = dfs(grid, row, col - 1);
            res += area4;
        }
        return res;
    }
}
