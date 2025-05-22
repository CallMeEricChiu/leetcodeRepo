package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number958 {

    public boolean isCompleteTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        boolean isCompleteTree = true;
        boolean meetNull = false;
        while(!list.isEmpty() && isCompleteTree) {
            TreeNode node = list.get(0);
            if(node == null){
                meetNull = true;
                continue;
            } else if(meetNull) {
                isCompleteTree = false;
            }
            list.add(node.left);
            list.add(node.right);
        }
        return isCompleteTree;
    }
}
