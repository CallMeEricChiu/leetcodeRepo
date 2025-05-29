package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number518 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        boolean[] valid = new boolean[amount + 1];
        dp[0] = 1;
        valid[0] = true;
        for(int coin : coins) {
            for(int i = 1; i <= amount; i++) {
                if(i - coin >= 0) {
                    valid[i] |= valid[i - coin];
                }
            }
        }
        if(!valid[amount]) {
            return 0;
        }
        for(int coin : coins) {
            for(int i = 1; i <= amount; i++) {
                if(i - coin >= 0) {
                    dp[i] += dp[i - coin];
                }
            }
        }
        return dp[amount];
    }
}
