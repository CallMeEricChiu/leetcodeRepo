package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number470 {

    public int rand10() {
        int randSum = 0;
        for(int i = 0; i < 10; i++) {
            randSum += rand7();
        }

        return  (randSum - 1) / 7 + 1;
    }

    private int rand7() {
        return 0;
    }

}
