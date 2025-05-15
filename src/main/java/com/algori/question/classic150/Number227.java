package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number227 {

    public int calculate(String s) {
        // 3+2*2*2+4
        // 3 + 8 + 4
        char sign = '+';
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if(!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                if(sign == '+') {
                    stack.push(num);
                } else if(sign == '-') {
                    stack.push(-num);
                } else if(sign == '*') {
                    stack.push(stack.pop() * num);
                } else {
                    stack.push(stack.pop() / num);
                }
                sign = c;
                num = 0;
            }
        }
        int res = 0;
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}
