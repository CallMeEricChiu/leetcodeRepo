package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;

        for(int i = 0; i < length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = length - 1;
            for(int j = i + 1; j < length - 1; j++) {
                // int k = length - 1;
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while(j < k) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> subRes = new ArrayList<>();
                        subRes.add(nums[i]);
                        subRes.add(nums[j]);
                        subRes.add(nums[k]);
                        res.add(subRes);
                        break;
                    } else if(nums[i] + nums[j] + nums[k] < 0) {
                        break;
                    }
                    k--;
                }
            }
        }
        return res;
    }
}
