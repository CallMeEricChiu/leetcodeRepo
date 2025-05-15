package com.algori.question.classic150;

import jdk.nashorn.internal.ir.CallNode;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int a = in.nextInt();
        int[] nums = new int[a];
        for(int i = 0; i < a; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int best = Integer.MAX_VALUE, res = 0;
        for(int i = 0; i < length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = length - 1, j = i + 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) {
                    return target;
                }
                if(Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if(sum > target) {
                    k--;
                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    j++;
                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }
        return best;
    }
}
