package com.algori.question.leetcode.editor.cn.subarraySumEqualsK560;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            int left = nums[i] - k;
            if(map.containsKey(left)){
                res += map.get(left);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
