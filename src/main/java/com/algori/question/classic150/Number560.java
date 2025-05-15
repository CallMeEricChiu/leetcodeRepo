package com.algori.question.classic150;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number560 {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pre = 0,res = 0;
        for(int num : nums) {
            pre += num;
            if(map.containsKey(pre - k)) {
                res += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return res;
    }
}
