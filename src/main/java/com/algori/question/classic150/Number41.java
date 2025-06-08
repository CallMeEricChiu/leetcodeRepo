package com.algori.question.classic150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number41 {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] < n) {
                nums[i] = n + 1;
            }
        }
        for(int i = 0; i < n; i++) {
            if(Math.abs(nums[i]) < n + 1 && nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
