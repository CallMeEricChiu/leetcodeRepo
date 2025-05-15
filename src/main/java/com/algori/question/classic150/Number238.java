package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number238 {

    public static void main(String[] args) {
        Number238 number238 = new Number238();
        int[] res = number238.productExceptSelf(new int[]{1, 2, 3});
        System.out.println(res);
    }
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] L = new int[length], R = new int[length], res = new int[length];
        L[0] = 1;
        R[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = L[i - 1] * nums[i - 1];
            R[length - i -1] = R[length - i] * nums[length - i];
        }
        for(int i = 0; i < length; i++) {
            res[i] = L[i] * R[i];
        }
        return res;
    }
}
