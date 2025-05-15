package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number322 {

    public static void main(String[] args) {
        Number322 number322 = new Number322();
        int i = number322.coinChange(new int[]{1, 2, 5}, 11);
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 1; i <= amount; i++) {
            dp[i] = -1;
            for(int coin : coins) {
                if(i - coin >= 0 && dp[i - coin] >= 0) {
                    if(dp[i] < 0) {
                        dp[i] = dp[i - coin] + 1;
                    } else {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }
        }
        return dp[amount];
    }
}
