package com.algori.question.leetcode.editor.cn.kthLargestElementInAnArray215;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        if(l == r) {
            return nums[k];
        }
        int x = nums[l], i = l - 1, j = r + 1;
        while(i < j) {
            do {
                i++;
            } while(nums[i] < x);
            do {
                j--;
            } while((nums[j] > x));
            if(i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }

        if(k <= j) {
            return quickSelect(nums, l, j, k);
        } else {
            return quickSelect(nums, j + 1, r, k);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
