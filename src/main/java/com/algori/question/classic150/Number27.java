package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number27 {

    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0, k = 0;
        while(fast < nums.length) {
            while(fast < nums.length && nums[fast] == val) {
                fast++;
            }
            if(fast >= nums.length) {
                break;
            }
            nums[slow++] = nums[fast++];
            k++;
        }
        return k;
    }
}
