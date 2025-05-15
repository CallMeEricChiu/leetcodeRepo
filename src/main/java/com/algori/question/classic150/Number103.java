package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        boolean leftToRight = true;
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return new ArrayList<>();
        }
        Deque<Deque<TreeNode>> nodesList = new ArrayDeque<>();
        Deque<TreeNode> rootNodeDeque = new ArrayDeque<>();
        rootNodeDeque.add(root);

        nodesList.add(rootNodeDeque);
        while(!nodesList.isEmpty()) {
            Deque<TreeNode> nodes = nodesList.poll();
            Deque<TreeNode> nextLevelNodes = new ArrayDeque<>();
            List<Integer> res = new ArrayList<>();
            for(TreeNode node : nodes) {
                if(leftToRight) {
                    res.add(node.val);
                } else {
                    res.add(0, node.val);
                }
                if(node.left != null) {
                    nextLevelNodes.add(node.left);
                }
                if(node.right != null) {
                    nextLevelNodes.add(node.right);
                }
            }
            leftToRight = !leftToRight;
            if(!nextLevelNodes.isEmpty()) {
                nodesList.add(nextLevelNodes);
            }
            if(!res.isEmpty()) {
                result.add(res);
            }
        }
        return result;
    }
}
