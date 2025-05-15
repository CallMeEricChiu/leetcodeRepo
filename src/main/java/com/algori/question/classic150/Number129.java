package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number129 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Number129 number129 = new Number129();
        int i = number129.sumNumbers(root);
    }
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        findPath(root, new ArrayList<>(), res);
        return getSum(res);
    }

    private void findPath(TreeNode node, List<Integer> path, List<List<Integer>> res) {

        path.add(0, node.val);
        if(node.left == null && node.right == null) {
            res.add(new ArrayList<>(path));
        } else if(node.left == null) {
            findPath(node.right, path, res);
        } else if(node.right == null) {
            findPath(node.left, path, res);
        } else {
            findPath(node.left, path, res);
            findPath(node.right, path, res);
        }
        path.remove(0);
    }

    private int getSum(List<List<Integer>> numbers) {
        int res = 0;
        for(List<Integer> l : numbers) {
            int wei = 1;
            for(Integer i : l) {
                res += wei * i;
                wei = wei * 10;
            }
        }
        return res;
    }
}
