package com.algori.question.classic150;

import sun.plugin.javascript.navig4.Link;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number12 {

    public static void main(String[] args) {

    }

    static LinkedHashMap<Integer, String> valueMap;
    static {
        valueMap = new LinkedHashMap<>();
        valueMap.put(1000, "M");
        valueMap.put(900, "CM");
        valueMap.put(500, "D");
        valueMap.put(400, "CD");
        valueMap.put(100, "C");
        valueMap.put(90, "XC");
        valueMap.put(50, "L");
        valueMap.put(40, "XL");
        valueMap.put(10, "X");
        valueMap.put(9, "IX");
        valueMap.put(5, "VI");
        valueMap.put(4, "IV");
        valueMap.put(1, "I");
    }
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, String> entry : valueMap.entrySet()) {
            Integer intNum = entry.getKey();
            String strNum = entry.getValue();
            int n = num / intNum;
            num = intNum % num;
            for(int i = 0; i < n; i++) {
                sb.append(strNum);
            }
        }
        return sb.toString();
    }
}
