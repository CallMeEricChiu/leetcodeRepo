package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number125 {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            while(!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && !(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                i++;
            }
            while(!(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') && !(s.charAt(j) >= 'a' && s.charAt(j) <= 'z')) {
                j++;
            }
            if(s.charAt(i) == s.charAt(j) || Math.abs(s.charAt(i) - s.charAt(j)) == Math.abs('a' - 'A')) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
