package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number123 {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[4][length + 1];
        int res = 0;
        dp[0][0]= Integer.MIN_VALUE;
        dp[2][0]= Integer.MIN_VALUE;
        for(int i = 1; i <= length; i++) {
            // 持有，第一次交易中
            // 不持有，第一次交易后
            // 持有，第二次交易中
            // 不持有，第二次交易后
            dp[0][i] = Math.max(-prices[i - 1], dp[0][i - 1]);
            dp[1][i] = Math.max(dp[0][i] + prices[i - 1], dp[1][i - 1]);
            dp[2][i] = Math.max(dp[1][i] - prices[i - 1], dp[2][i - 1]);
            dp[3][i] = Math.max(dp[2][i] + prices[i - 1], dp[3][i - 1]);
            res = Math.max(res, Math.max(dp[1][i], dp[3][i]));
        }
        return res;
    }
}
