package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number113 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Number113 number113 = new Number113();
        List<List<Integer>> lists = number113.pathSum(root, 3);
        System.out.println(lists);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, 0, res, new ArrayList<>());
        return res;
    }

    private void dfs(TreeNode node, int targetSum, int sum, List<List<Integer>> res,
                     List<Integer> path) {
        if(node == null) {
            if(sum == targetSum && !path.isEmpty()) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        path.add(node.val);
        if(node.left == null && node.right == null) {
            dfs(node.left, targetSum, sum + node.val, res, path);
        } else {
            if(node.left != null) {
                dfs(node.left, targetSum, sum + node.val, res, path);
            }
            if(node.right != null) {
                dfs(node.right, targetSum, sum + node.val, res, path);
            }
        }
        path.remove(path.size() - 1);
    }
}
