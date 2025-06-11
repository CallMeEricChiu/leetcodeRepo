package com.algori.question.leetcode.editor.cn.sortAnArray912;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.sortArray(new int[]{5,2,3,1});
        System.out.println(Arrays.toString(res));
    }

    int[] tmp;

    public int[] sortArray(int[] nums) {
        tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int i, int j) {
        if(i >= j) {
            return;
        }
        int mid = (i + j) / 2;
        mergeSort(nums, i, mid);
        mergeSort(nums, mid+ 1, j);
        mergeTwoList(nums, i, mid, mid + 1, j);
    }

    private void mergeTwoList(int[] nums, int l1, int r1, int l2, int r2) {
        int i = l1, j = l2;
        int cur = l1;
        while(i <= r1 && j <= r2) {
            if(nums[i] > nums[j]) {
                tmp[cur++] = nums[j++];
            } else {
                tmp[cur++] = nums[i++];
            }
        }
        if(i <= r1) {
            while(i <= r1) {
                tmp[cur++] = nums[i++];
            }
        } else {
            while(j <= r2) {
                tmp[cur++] = nums[j++];
            }
        }
        for(int k = l1; k < cur; k++) {
            nums[k] = tmp[k];
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
