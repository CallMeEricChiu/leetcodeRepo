package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number152 {

    public static void main(String[] args) {
        int[] nums = {-3,-1,-1};
        Number152 number152 = new Number152();
        int i = number152.maxProduct(nums);
        System.out.println(i);
    }
    public int maxProduct(int[] nums) {
        int length = nums.length;
        // dp[0] 最小值
        // dp[1] 最大值
        int[][] dp = new int[2][length + 1];
        dp[0][0] = 1;
        dp[1][0] = 1;
        int res = Integer.MIN_VALUE;
        for(int i = 1; i <= length; i++) {
            if(nums[i - 1] >= 0) {
                dp[0][i] = Math.min(nums[i - 1], dp[0][i - 1] * nums[i - 1]);
                dp[1][i] = Math.max(nums[i - 1], dp[1][i - 1] * nums[i - 1]);
            } else {
                dp[0][i] = Math.min(nums[i - 1], dp[1][i - 1] * nums[i - 1]);
                dp[1][i] = Math.max(nums[i - 1], dp[0][i - 1] * nums[i - 1]);
            }
            res = Math.max(res, dp[1][i]);
        }
        return res;
    }
}
