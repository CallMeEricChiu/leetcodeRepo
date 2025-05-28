package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number114 {

    public void flatten(TreeNode root) {
        inorder(root);
    }

    public TreeNode inorder(TreeNode node) {
        if(node == null) {
            return null;
        }
        TreeNode leftListNode = inorder(node.left);
        TreeNode rightListNode = inorder(node.right);
        node.left = null;
        node.right = leftListNode;
        TreeNode cur = node;
        while(cur.right != null) {
            cur = cur.right;
        }
        cur.right = rightListNode;
        return node;
    }
}
