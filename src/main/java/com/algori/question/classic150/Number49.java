package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if(!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            } else {
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
