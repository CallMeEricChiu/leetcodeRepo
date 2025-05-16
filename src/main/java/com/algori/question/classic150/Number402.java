package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number402 {

    public static void main(String[] args) {
        Number402 n = new Number402();
        String res = n.removeKdigits("9", 1);
        System.out.println(res);

    }

    public String removeKdigits(String num, int k) {
        if(num == null || num.isEmpty()) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        // stack.push(num.charAt(0));
        for(int i = 0; i < num.length(); i++) {
            while(!stack.isEmpty() && k > 0 && num.charAt(i) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k > 0) {
            stack.pop();
            k--;
        }
        if(stack.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        while(sb.length() > 1 && sb.charAt(0) == '0') {
            sb.delete(0, 1);
        }
        return sb.toString();
    }
}
