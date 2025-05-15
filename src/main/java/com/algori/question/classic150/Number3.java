package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number3 {

    public int lengthOfLongestSubstring(String s) {
        // tmmzuxt
        int max = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < length) {
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                i = map.get(s.charAt(j)) + 1;
            } else {
                max = Math.max(max, j - i + 1);
            }
            map.put(s.charAt(j), j);
            j++;
        }
        return max;
    }
}
