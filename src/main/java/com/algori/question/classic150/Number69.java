package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number69 {

    public int mySqrt(int x) {
        return findMid(x, 0, x);
    }

    public int findMid(int x, int low, int high) {
        if(low + 1 == high) {
            return x == 1 ? 1 : low;
        }

        int mid = (low + high) / 2;
        if(x == mid * mid) {
            return mid;
        } else if(x > mid * mid) {
            return findMid(x, mid, high);
        } else {
            return findMid(x, low, mid);
        }
    }
}
