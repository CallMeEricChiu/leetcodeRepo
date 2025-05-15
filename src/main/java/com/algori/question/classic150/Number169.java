package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number169 {

    public static void main() {
        int i = new Number169().majorityElement(new int[]{3, 2, 3});
    }

    public int majorityElement(int[] nums) {
        // 记录最多的数
        int count = 1;
        // 记录最多的数的个数
        int current = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == current) {
                count++;
            } else {
                count--;
                if(count == 0) {
                    current = nums[i];
                    count = 1;
                }
            }
        }
        return current;
    }
}
