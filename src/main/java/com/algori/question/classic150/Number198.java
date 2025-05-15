package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number198 {

    public int rob(int[] nums) {
        int[][] dp = new int[2][nums.length];
        // dp[0][j] 表示为打劫
        // dp[1][j] 表示打劫
        dp[0][0] = 0;
        dp[1][0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            // 不打劫
            dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1]);
            // 打劫
            dp[1][i] = dp[0][i-1] + nums[i];
        }
        return Math.max(dp[0][nums.length-1], dp[1][nums.length-1]);
    }
}
