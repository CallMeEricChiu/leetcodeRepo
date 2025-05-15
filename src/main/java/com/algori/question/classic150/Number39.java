package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        // int[] sorted = Arrays.stream(candidates).sorted().toArray();
        backtrack(candidates, target, res, 0, new ArrayList<>(), 0);
        return res;
    }

     private void backtrack(int[] candidates, int target, List<List<Integer>> res, int sum,
                            List<Integer> path, int start) {
        if(sum == target) {
            res.add(new ArrayList<>(path));
        } else if(sum > target) {
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, res, sum, path, i);
            path.remove(path.size() - 1);
            sum -= candidates[i];
        }
     }
}
