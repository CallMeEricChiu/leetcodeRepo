package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number46 {

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>(nums.length);
        backtrack(new ArrayList<>(), nums, res, visited);
        return res;
    }

    private void backtrack(List<Integer> list, int[] nums, List<List<Integer>> res,
                           boolean[] visited) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                backtrack(list, nums, res, visited);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
