package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number45 {

    public static void main() {
    }

    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0;
        int maxPos = 0;
        int steps = 0;
        for(int i = 0; i < len - 1; i++) {
            maxPos = Math.max(maxPos, i + nums[i]);
            if(i == end) {
                end = maxPos;
                steps++;
            }
        }
        return steps;
    }
}
