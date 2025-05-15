package com.algori.question.classic150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number41 {

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
                max = Math.max(max, num);
            }
        }
        int i = 1;
        while(i < max) {
            if(!set.contains(i)) {
                return i;
            }
            i++;
        }
        return i + 1;
    }
}
