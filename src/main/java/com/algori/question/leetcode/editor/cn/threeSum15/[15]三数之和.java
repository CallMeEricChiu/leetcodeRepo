package com.algori.question.leetcode.editor.cn.threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    ArrayList<Integer> subres = new ArrayList<>();
                    subres.add(nums[i]);
                    subres.add(nums[j]);
                    subres.add(nums[k]);
                    res.add(subres);
                    break;
                } else if(sum < 0) {
                    break;
                }
                j++;
                while(nums[j] == nums[j - 1]) {
                    j++;
                }
                k--;
                while(nums[k] == nums[k + 1]) {
                    k--;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
