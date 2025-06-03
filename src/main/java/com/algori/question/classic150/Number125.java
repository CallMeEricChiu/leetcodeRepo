package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number125 {

    public static void main(String[] args) {
        Number125 number125 = new Number125();
        boolean palindrome = number125.isPalindrome("0P");
        System.out.println(palindrome);
    }

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for(int x = 0; x < s.length(); x++) {
            if(Character.isLetterOrDigit(s.charAt(x))) {
                sb.append(s.charAt(x));
            }
        }
        int i = 0, j = sb.length() - 1;
        while(i < j) {
            if(Character.toLowerCase(sb.charAt(i)) ==
                Character.toLowerCase(sb.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
