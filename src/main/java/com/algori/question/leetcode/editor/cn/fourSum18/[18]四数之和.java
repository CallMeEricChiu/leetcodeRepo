package com.algori.question.leetcode.editor.cn.fourSum18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296);
        System.out.println(lists);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i + 1; j < length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = length - 1;
                for(int k = j + 1; k < length - 1; k++) {
                    if(k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    while(k < l) {
                        if((long)nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            ArrayList<Integer> subRes = new ArrayList<>();
                            subRes.add(nums[i]);
                            subRes.add(nums[j]);
                            subRes.add(nums[k]);
                            subRes.add(nums[l]);
                            res.add(subRes);
                            break;
                        } else if((long)nums[i] + nums[j] + nums[k] + nums[l] < target) {
                            break;
                        }
                        l--;
                    }
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
