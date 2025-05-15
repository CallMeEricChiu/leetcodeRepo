package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number5 {

    public static void main() {
    }

    public String longestPalindrome(String s) {
        if(s.isEmpty() || s.length()==1) {
            return s;
        }
        int length = s.length();
        int[][] dp = new int[length][length];
        int max = 0;
        int left = 0;
        int right = 0;
        for(int j = 0; j < length; j++) {
            for(int i = 0; i <= j; i++) {
                if(i == j) {
                    dp[i][j] = 1;
                    if(max < 1) {
                        left = i;
                        right = j;
                        max= 1;
                    }
                } else if(i + 1 == j) {
                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                        if(max < 2) {
                            left = i;
                            right = j;
                            max = 2;
                        }
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                        dp[i][j] = 1;
                        if(max < j - i + 1) {
                            max = j - i + 1;
                            left = i;
                            right = j;
                        }
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }
}
