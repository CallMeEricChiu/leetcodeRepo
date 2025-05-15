package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number62 {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if(i == 0) {
                    dp[i][j] = dp[0][j - 1];
                } else if(j == 0) {
                    dp[i][j] = dp[i - 1][0];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    private int dfs(int m, int n, int row, int col) {
        if(row >= m || col >= n) {
            return 0;
        }
        if(row == m - 1 && col == n - 1) {
            return 1;
        }
        int pathNums1 = dfs(m, n, row + 1, col);
        int pathNums2 = dfs(m, n, row, col + 1);
        return pathNums1 + pathNums2;
    }
}
