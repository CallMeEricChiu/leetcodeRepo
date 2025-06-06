package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number167 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            if(numbers[i] + numbers[j] > target) {
                j--;
            } else if(numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
