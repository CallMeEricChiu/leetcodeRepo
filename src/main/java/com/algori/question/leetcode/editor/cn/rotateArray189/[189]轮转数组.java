package com.algori.question.leetcode.editor.cn.rotateArray189;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateSub(nums, 0, nums.length - 1);
        rotateSub(nums, 0, k - 1);
        rotateSub(nums, k, nums.length - 1);
    }

    private void rotateSub(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
