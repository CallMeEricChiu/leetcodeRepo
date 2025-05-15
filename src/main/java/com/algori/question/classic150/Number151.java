package com.algori.question.classic150;

import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number151 {

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sub = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sub.append(s.charAt(i));
            } else if(sub.length() > 0) {
                res.append(sub.toString());
                res.append(' ');
                sub.setLength(0);
            }
        }
        return res.toString();
    }
}
