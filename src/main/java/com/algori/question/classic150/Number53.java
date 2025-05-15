package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number53 {

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return nums[0];
        }
        int dp = nums[0];
        int max = dp;
        for(int i = 1; i < length; i++) {
            dp = Math.max(nums[i],dp + nums[i]);
            max = Math.max(max,dp);
        }
        return max;
    }
}
