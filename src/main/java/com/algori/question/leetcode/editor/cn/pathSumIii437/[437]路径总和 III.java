package com.algori.question.leetcode.editor.cn.pathSumIii437;
import com.algori.question.classic150.TreeNode;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
//leetcode submit region begin(Prohibit modification and deletion)



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int res;

    public int pathSum(TreeNode root, int targetSum) {
        res = 0;
        dfs(root, targetSum);
        return res;
    }

    private List<Long> dfs(TreeNode node, int targetSum) {
        if(node == null) {
            return new ArrayList<>();
        }
        List<Long> leftSums = dfs(node.left, targetSum);
        List<Long> rightSums = dfs(node.right, targetSum);
        List<Long> nums = new ArrayList<>();
        for(Long leftSum : leftSums) {
            if(leftSum + node.val == targetSum) {
                res++;
            }
            nums.add(leftSum + node.val);
        }
        for(Long rightSum : rightSums) {
            if(rightSum + node.val == targetSum) {
                res++;
            }
            nums.add(rightSum + node.val);
        }
        if(node.val == targetSum) {
            res++;
        }
        nums.add((long)node.val);

        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
