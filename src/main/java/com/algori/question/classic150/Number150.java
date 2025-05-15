package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number150 {

    public static void main(String[] args) {
        int candy = new Number150().candy(new int[]{1, 2, 3, 2, 2});
        System.out.println(candy);
    }

    public int candy(int[] ratings) {
        int[] right = new int[ratings.length];
        int[] left = new int[ratings.length];
        right[0] = 1;
        left[ratings.length - 1] = 1;
        for(int i = 0; i < ratings.length - 1; i++) {
            int j = ratings.length - 1 - i;

            if(ratings[i] < ratings[i + 1]) {
                right[i + 1] = right[i] + 1;
            } else {
                right[i + 1] = 1;
            }

            if(ratings[j - 1] > ratings[j]) {
                left[j - 1] = left[j] + 1;
            } else {
                left[j - 1] = 1;
            }
        }
        int res = 0;
        for(int i = 0; i < ratings.length; i++) {
            res += Math.max(right[i], left[i]);
        }
        return res;
    }
}
