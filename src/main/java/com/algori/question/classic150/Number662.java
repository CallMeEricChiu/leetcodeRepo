package com.algori.question.classic150;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number662 {

    public int widthOfBinaryTree(TreeNode root) {
        List<Pair<TreeNode, Integer>> lists = new ArrayList<>();
        int res = 0;
        lists.add(new Pair<>(root, 1));
        while(!lists.isEmpty()) {
            res = Math.max(res,
                lists.get(lists.size() - 1).getValue() - lists.get(0).getValue() + 1);
            List<Pair<TreeNode, Integer>> tmp = new ArrayList<>();
            for(Pair<TreeNode, Integer> pair : lists) {
                TreeNode node = pair.getKey();
                int index = pair.getValue();
                if(node.left != null) {
                    tmp.add(new Pair<>(node.left, index * 2));
                }
                if(node.right != null) {
                    tmp.add(new Pair<>(node.right, index * 2 + 1));
                }
            }
            lists = tmp;
        }
        return res;
    }


}
