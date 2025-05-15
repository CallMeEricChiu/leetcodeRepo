package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrderRecurse(root, res);
        return res;
    }

    public void inOrderRecurse(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        inOrderRecurse(root.left, res);
        res.add(root.val);
        inOrderRecurse(root.right, res);
    }

    public List<Integer> inOrderNoRecurse(TreeNode root) {
        // 中序遍历，非递归
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = root;
        while(pNode != null || !stack.isEmpty()) {
            if(pNode != null) {
                stack.push(pNode);
                // preOrder
                // res.add(node.val);
                pNode = pNode.left;
            } else {
                TreeNode node = stack.pop();
                res.add(node.val);
                pNode = node.right;
            }
        }
        return res;
    }
}
