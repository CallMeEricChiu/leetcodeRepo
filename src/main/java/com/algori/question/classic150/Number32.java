package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number32 {

    public int longestValidParentheses(String s) {
        int length = s.length();
        int[] dp = new int[length];
        int res = 0;
        for(int i = 1; i < length; i++) {
            char c = s.charAt(i);
            if(c == '(') {
                dp[i] = 0;
            } else if(c == ')') {
                if(s.charAt(i - 1) == '(') {
                    if(i - 2 >= 0) {
                        dp[i] = 2 + dp[i - 2];
                    } else {
                        dp[i] = 2;
                    }
                } else if(s.charAt(i - 1) == ')') {
                    if(i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        if(i - dp[i - 1] - 2 > 0) {
                            dp[i] = 2 + dp[i - 1] + dp[i - dp[i - 1] - 2];
                        } else {
                            dp[i] = 2 + dp[i - 1];
                        }
                    }
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
