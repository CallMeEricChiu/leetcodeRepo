package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number8 {

    public static void main(String[] args) {
        Number8 number8 = new Number8();
        int i = number8.myAtoi("-2147483647");
        System.out.println(i);
    }
    public int myAtoi(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(('-' == c || '+' == c) && stringBuilder.length() == 0) {
                stringBuilder.append(c);
            } else if(Character.isDigit(c)){
                if(c == '0') {
                    if((stringBuilder.length() == 1 && (
                        stringBuilder.charAt(0) == '-' || stringBuilder.charAt(0) == '+' || stringBuilder.charAt(0) == '0'))) {
                        continue;
                    }
                }
                stringBuilder.append(c);
            } else if(stringBuilder.length() != 0 || !Character.isDigit(c)) {
                break;
            }
        }
        if(stringBuilder.length() == 0 || (stringBuilder.length() == 1 && (stringBuilder.charAt(0) == '-' || stringBuilder.charAt(0) == '+'))) {
            return 0;
        }
        if(stringBuilder.length() > String.valueOf(Integer.MIN_VALUE).length()) {
            if(stringBuilder.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        long l = Long.parseLong(stringBuilder.toString());
        if(l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) l;
        }
    }
}
