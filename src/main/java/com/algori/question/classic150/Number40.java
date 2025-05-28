package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number40 {

    public static void main(String[] args) {
        Number40 number40 = new Number40();
        List<List<Integer>> lists = number40.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(lists);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<List<Integer>> res = new ArrayList<>();
        backTrack(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void backTrack(int[] candidates, int target, int index, int sum,
                           List<Integer> path, List<List<Integer>> res) {
        if(sum == target) {
            res.add(new ArrayList<>(path));
            return;
        } else if(sum > target) {
            return;
        }

        for(int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            backTrack(candidates, target, i + 1,  sum + candidates[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}
