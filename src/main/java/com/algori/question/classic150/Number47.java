package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number47 {
    public static void main(String[] args) {
        Number47 n = new Number47();
        List<List<Integer>> res = n.permuteUnique(new int[]{1,1,2});
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, new ArrayList<>(), res, new boolean[nums.length]);
        return res;
    }

    private void backTrack(int[] nums, List<Integer> path, List<List<Integer>> res,
                           boolean[] visited) {
        if(path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        int pre = -999;
        for(int i = 0; i < nums.length; i++) {
            if(pre == nums[i] || visited[i]) {
                continue;
            }
            pre = nums[i];
            path.add(nums[i]);
            visited[i] = true;
            backTrack(nums, path, res, visited);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
}
