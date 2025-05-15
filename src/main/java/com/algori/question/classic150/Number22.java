package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number22 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] counter = new int[n + 1];
        for(int citation : citations) {
            if(citation >= n) {
                counter[n]++;
            } else {
                counter[citation]++;
            }
        }

        int res = 0;
        for(int i = n; i >= 0; i--) {
            res += counter[i];
            if(res >= i) {
                return i;
            }
        }
        return 0;
    }
}
