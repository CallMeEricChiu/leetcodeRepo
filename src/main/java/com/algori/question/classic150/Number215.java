package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number215 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Number215 number215 = new Number215();
        System.out.println(number215.findKthLargest(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k-1);
        return nums[k-1];
    }

    private void quickSort(int[] nums, int left, int right, int k) {
        if(left >= right) {
            return;
        }
        int pivot = partition(nums, left, right);
        if(pivot < k) {
            quickSort(nums, pivot + 1, right, k);
        } else {
            quickSort(nums, left, pivot - 1, k);
        }

    }

    private int partition(int[] nums, int left, int right) {
        int pivotIndex = left + (int) (Math.random() * (right - left + 1));
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, left);
        int i = left;
        for(int j = left + 1; j <= right; j++) {
            if(nums[j] >= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i, left);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
