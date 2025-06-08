package com.algori.question.classic150;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number394 {

    public String decodeString(String s) {
        // 3[ad]2[2[c]20[h]]qe
        Stack<Integer> multiStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        StringBuilder subBuilder = new StringBuilder();
        int multi = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                multi = multi * 10 + c - '0';
            } else if(c == '[') {
                multiStack.push(multi);
                resStack.push(subBuilder.toString());
                subBuilder.setLength(0);
                multi = 0;
            } else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int repeatedNums = multiStack.pop();
                for(int j = 0; j < repeatedNums; j++) {
                    tmp.append(subBuilder);
                }
                subBuilder = new StringBuilder(resStack.pop() + tmp);
            } else {
                subBuilder.append(c);
            }
        }
        return subBuilder.toString();
    }
}
