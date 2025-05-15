package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number105 {

    public static void main(String[] args) {
        Number105 number105 = new Number105();
        int[] preorder = {1, 2};
        int[] inorder = {1, 2};
        TreeNode treeNode = number105.buildTree(preorder, inorder);
        System.out.println(treeNode);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildSubTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildSubTree(int[] preorder, int[] inorder, int preorderIndex,
                                  int inorderLeftIndex, int inorderRightIndex) {
        if(preorderIndex >= preorder.length || inorderRightIndex >= inorder.length || inorderLeftIndex > inorderRightIndex) {
            return null;
        }
        if(inorderLeftIndex == inorderRightIndex) {
            return new TreeNode(inorder[inorderLeftIndex]);
        }

        // 找到inOrderIndex
        int rootVal = preorder[preorderIndex];
        TreeNode rootNode = new TreeNode(rootVal);
        int i = inorderLeftIndex;
        while(i <= inorderRightIndex) {
            if(inorder[i] == rootVal) {
                break;
            }
            i++;
        }
        int leftTreeLen = i - inorderLeftIndex;
        int leftTreeRootIndex = preorderIndex + 1;
        int rightTreeRootIndex = preorderIndex + leftTreeLen + 1;
        TreeNode leftTreeNode = buildSubTree(preorder, inorder, leftTreeRootIndex,
            inorderLeftIndex, i - 1);
        TreeNode rightTreeNode = buildSubTree(preorder, inorder, rightTreeRootIndex, i + 1, inorderRightIndex);
        rootNode.left = leftTreeNode;
        rootNode.right = rightTreeNode;
        return rootNode;
    }
}
