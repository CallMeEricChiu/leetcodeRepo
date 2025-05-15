package com.algori.question.classic150;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Deque<List<TreeNode>> deque = new LinkedList<>();
        deque.addLast(Arrays.asList(root));

        while(!deque.isEmpty()) {
            List<TreeNode> treeNodes = deque.pollFirst();
            List<TreeNode> nextLevel = new ArrayList<>();
            for(int i = 0; i < treeNodes.size(); i++) {
                TreeNode treeNode = treeNodes.get(i);
                if(i == 0) {
                    res.add(treeNode.val);
                }
                if(treeNode.right != null) {
                    nextLevel.add(treeNode.right);
                }
                if(treeNode.left != null) {
                    nextLevel.add(treeNode.left);
                }
            }
            if(!nextLevel.isEmpty()) {
                deque.addLast(nextLevel);
            }
        }
        return res;
    }

}
