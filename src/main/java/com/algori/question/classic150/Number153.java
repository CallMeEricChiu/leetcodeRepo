package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number153 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};
        Number153 n = new Number153();
        int res = n.findMin(nums);
    }
    public int findMin(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }

    private int find(int[] nums, int i, int j) {
        if(i == j) {
            return nums[i];
        }
        int mid = (i + j) / 2;
        if(nums[mid] >= nums[i]) {
            if(nums[mid] > nums[j]) {
                return find(nums, mid + 1, j);
            } else {
                return find(nums, i, mid);
            }
        } else {
            return find(nums, i, mid);
        }
    }
}
