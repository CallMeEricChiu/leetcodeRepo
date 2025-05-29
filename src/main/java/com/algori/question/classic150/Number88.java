package com.algori.question.classic150;

import java.util.HashMap;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m + n - 1, i = m - 1, j = n - 1;
        while(x >= 0) {
            if(i < 0) {
                nums1[x--] = nums2[j--];
            } else if(j < 0) {
                nums1[x--] = nums1[i--];
            } else {
                if(nums1[i] >= nums2[j]) {
                    nums1[x--] = nums1[i--];
                } else {
                    nums1[x--] = nums2[j--];
                }
            }
        }
    }
}
