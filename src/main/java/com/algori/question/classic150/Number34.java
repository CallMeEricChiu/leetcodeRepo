package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number34 {

    public static void main(String[] args) {
        int[] nums = {2,2};
        Number34 number34 = new Number34();
        int[] ints = number34.searchRange(nums, 3);
        System.out.println(ints);
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        return new int[]{findLeft(nums, target, 0, nums.length - 1), findRight(nums, target, 0,
            nums.length - 1)};
    }

    public int findLeft(int[] nums, int target, int start, int end) {
        if(start >= end) {
            if(start < nums.length && nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        }
        int mid = (start + end) / 2;
        if(nums[mid] < target) {
            return findLeft(nums, target, mid + 1, end);
        } else if(nums[mid] > target) {
            return findLeft(nums, target, start, mid - 1);
        } else {
            return findLeft(nums, target, start, mid);
        }
    }

    private int findRight(int[] nums, int target, int start, int end) {
        if(start >= end) {
            if(start < nums.length && nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        }

        int mid = (start + end + 1) / 2;
        if(nums[mid] > target) {
            return findRight(nums, target, start, mid - 1);
        } else if(nums[mid] < target) {
            return findRight(nums, target, mid + 1, end);
        } else {
            return findRight(nums, target, mid, end);
        }
    }
}
