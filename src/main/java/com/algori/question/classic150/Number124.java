package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number124 {
    private Integer max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        max = Math.max(Math.max(max, root.val + left + right), Math.max(Math.max(root.val + left,
            root.val + right), root.val));
        return Math.max(Math.max(left, right) + root.val, root.val);
    }
}
