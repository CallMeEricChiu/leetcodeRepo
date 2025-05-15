package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number7 {

    public static void main(String[] args) {
        Number7 number7 = new Number7();
        int reverse = number7.reverse(-901000);
        System.out.println(reverse);
    }

    public int reverse(int x) {
        int num = x;
        List<Integer> nums = new ArrayList<>();
        while(num != 0) {
            nums.add(num % 10);
            num /= 10;
        }
        int res = 0;
        for(Integer integer : nums) {
            if(res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if(integer < 0) {
                if(res < 0 && Integer.MIN_VALUE - res * 10 > integer) {
                    return 0;
                }
            } else {
                if(res > 0 && integer > Integer.MAX_VALUE - res * 10) {
                    return 0;
                }
            }
            res = res * 10 + integer;
        }
        return res;
    }
}
