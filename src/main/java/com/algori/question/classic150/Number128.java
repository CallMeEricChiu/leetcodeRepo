package com.algori.question.classic150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number128 {

    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {

            if (set.contains(num - 1)) {
                continue;
            }
            int y = num + 1;
            while(set.contains(y)) {
                y++;
            }
            res = Math.max(res, y - num);
        }
        return res;
    }
}
