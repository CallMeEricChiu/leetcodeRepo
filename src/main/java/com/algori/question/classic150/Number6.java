package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number6 {

    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        int flag = -1;
        for(int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int i = 0;
        for(char c : s.toCharArray()) {
            sbs[i].append(c);
            if(i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : sbs) {
            res.append(sb.toString());
        }
        return res.toString();
    }
}
