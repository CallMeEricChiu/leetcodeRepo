package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number162 {

    public static void main(String[] args) {
        Number162 obj = new Number162();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int peakElement = obj.findPeakElement(nums);
        System.out.println(peakElement);
    }
    public int findPeakElement(int[] nums) {
        //     [1,2,1,3,5,6,4]
        return findPeak(nums, 0, nums.length - 1);
    }

    private int findPeak(int[] nums, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(mid < nums.length - 1 && mid > 0 && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
            return mid;
        } else if(mid == nums.length - 1 && mid == 0) {
            return mid;
        }else if(mid == nums.length - 1 && nums[mid] > nums[mid - 1]) {
            return mid;
        } else if(mid == 0 && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        if(nums[mid] <= nums[mid + 1]) {
            return findPeak(nums, mid + 1, end);
        } else {
            return findPeak(nums, start, mid - 1);
        }
    }
}
