package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number189 {

    public static void main() {
        new Number189().rotate(new int[]{1, 2, 3, 4, 5, 6}, 3);
    }

    public void rotate(int[] nums, int k) {
        int rotateNum = k % nums.length;
        if(rotateNum == 0 || nums.length == 1) {
            return;
        }
        int count =  gcd(nums.length, rotateNum);
        for(int start = 0; start < count; start++) {
            int cur = start;
            int tmp = nums[start];
            do {
                cur = (cur + rotateNum) % nums.length;
                int t = nums[cur];
                nums[cur] = tmp;
                tmp = t;
            } while(cur != start);
        }
    }
    public int gcd(int x, int y) {
        return y>0 ? gcd(y, x % y) : x;
    }
}
