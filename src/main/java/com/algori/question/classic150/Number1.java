package com.algori.question.classic150;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }
}
