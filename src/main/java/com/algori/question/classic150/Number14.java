package com.algori.question.classic150;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = strs[0].length();
        for(String str : strs) {
            length = Math.min(length, str.length());
        }
        for(int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            boolean diff = false;
            for(String str : strs) {
                if(c != str.charAt(i)) {
                    diff = true;
                    break;
                }
            }
            if(diff) {
                break;
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
