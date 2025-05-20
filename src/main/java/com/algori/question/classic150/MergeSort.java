package com.algori.question.classic150;

import java.util.Arrays;

/**
 * @author qiuzhiyi
 * @date 2025/05/19
 */
public class MergeSort {

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] res = m.sort(new int[]{3,2,6,7,1,22,66,23});
        System.out.println(Arrays.toString(res));
    }
    int[] temp;

    public int[] sort(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {
        if(left >= right) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        int i = left, j = mid + 1, cnt = 0;
        while(i <= mid && j <= right) {
            if(nums[i] > nums[j]) {
                temp[cnt++] = nums[j++];
            } else {
                temp[cnt++] = nums[i++];
            }
        }
        while(i <= mid) {
            temp[cnt++] = nums[i++];
        }
        while(j <= right) {
            temp[cnt++] = nums[j++];
        }
        if(right - left + 1 >= 0) {
            System.arraycopy(temp, 0, nums, left, right - left + 1);
        }
    }

}
