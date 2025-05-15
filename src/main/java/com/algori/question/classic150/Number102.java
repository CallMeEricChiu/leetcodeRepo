package com.algori.question.classic150;


import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number102 {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> resList = new ArrayList<>();
        LinkedList<List<TreeNode>> treeNodes = new LinkedList<>();
        treeNodes.add(Collections.singletonList(root));
        while(!treeNodes.isEmpty()) {
            List<TreeNode> nodes = treeNodes.poll();
            List<Integer> values = new ArrayList<>();
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            for(TreeNode node : nodes) {
                values.add(node.val);
                if(node.left != null) {
                    nextLevelNodes.add(node.left);
                }
                if(node.right != null) {
                    nextLevelNodes.add(node.right);
                }
            }
            resList.add(values);
            if(!nextLevelNodes.isEmpty()) {
                treeNodes.add(nextLevelNodes);
            }
        }
        return resList;
    }
}
