package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number209 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        Number209 number209 = new Number209();
        int res = number209.minSubArrayLen(11, nums);
        System.out.println(res);
    }

    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int sum = 0, res = Integer.MAX_VALUE;
        while(r < nums.length) {
            sum += nums[r];
            if(sum < target) {
                r++;
                continue;
            }
            while(l <= r && sum >= target) {
                res = Math.min(res, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
