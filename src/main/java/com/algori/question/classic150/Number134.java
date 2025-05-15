package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0;
        int n = gas.length;
        while (i < n) {
            int sumCost = 0, sumGas = 0;
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumGas += gas[j];
                sumCost += gas[j];
                if(sumCost > sumGas) {
                    break;
                }
                cnt++;
            }
            if(cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
