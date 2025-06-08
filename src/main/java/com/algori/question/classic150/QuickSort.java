/*
 * QuickSort.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/03/18
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 1, 5, 3, 3};
        QuickSort.quickSort(nums, 0, nums.length - 1);
        System.out.println();
    }
    public static void quickSort(int[] nums, int left, int right) {
        if(left >= right) {
            return;
        }
        int pivot = partition(nums, left, right);
        quickSort(nums, pivot + 1, right);
        quickSort(nums, left, pivot - 1);
    }

    private static int partition(int[] nums, int left, int right) {
        int pivotIndex = left + (int) (Math.random() * (right - left + 1));
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, left);
        int i = left;
        for(int j = left + 1; j <= right; j++) {
            if(nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i, left);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
