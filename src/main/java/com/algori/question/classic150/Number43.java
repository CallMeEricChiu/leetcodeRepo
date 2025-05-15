package com.algori.question.classic150;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number43 {

    public static void main(String[] args) {
        Number43 number43 = new Number43();
        String multiply = number43.multiply("999", "999");
        System.out.println(multiply);
    }

    public String multiply(String num1, String num2) {

        if(num1.length()< num2.length()){
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        int p = 0;
        for(int i = len2 - 1; i >= 0; i--) {
            int chengshu = num2.charAt(i) - '0';
            int[] plusNumber = new int[len1 + len2];
            int j = len1 - 1;
            while(j >= 0) {
                int beicheng = num1.charAt(j) - '0';
                int multiply = beicheng * chengshu + p;
                p = multiply / 10;
                int yushu = multiply % 10;
                plusNumber[i + j + 1] = yushu;
                j--;
            }
            if(p != 0) {
                plusNumber[i + j + 1] = p;
                p = 0;
            }
            plusTwoNums(res, plusNumber);
        }
        boolean start = false;
        StringBuilder sb = new StringBuilder();
        for(int num : res) {
            if(num != 0) {
                start = true;
            }
            if(start) {
                char i = (char) (num + '0');
                sb.append(i);
            }
        }
        return sb.length() != 0 ? sb.toString() : "0";
    }

    private void plusTwoNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int p = 0;
        for(int i = len1 - 1; i >= 0; i--) {
            int sum;
            sum = nums1[i] + nums2[i] + p;
            p = sum / 10;
            nums1[i] = sum % 10;
        }
    }
}
