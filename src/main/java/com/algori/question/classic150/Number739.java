package com.algori.question.classic150;


import java.util.Arrays;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number739 {
    public static void main(String[] args) {
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        Number739 number739 = new Number739();
        int[] res = number739.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(res));
    }
    // [73,74,75,71,69,72,76,73]
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1) {
            return new int[]{0};
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] res = new int[temperatures.length];
        int i = 1;
        while(!stack.isEmpty() && i < temperatures.length) {
            int temperature = temperatures[i];
            while(!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int prevTempId = stack.pop();
                res[prevTempId] = i - prevTempId;
            }
            stack.push(i);
            i++;
        }
        return res;
    }
}
