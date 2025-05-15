package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getParentNode(root, p, q);
    }

    private TreeNode getParentNode(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) {
            return null;
        }
        if(node == p || node == q) {
            return node;
        }
        TreeNode leftParentNode = getParentNode(node.left, p, q);
        TreeNode rightParentNode = getParentNode(node.right, p, q);
        if(leftParentNode != null && rightParentNode != null) {
            return node;
        } else if(leftParentNode != null) {
            return leftParentNode;
        } else if(rightParentNode != null) {
            return rightParentNode;
        }
        return null;
    }
}
