package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number380 {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public Number380() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        int index = list.size();
        map.put(val, index);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int lastIndex = map.size() - 1;
        int index = map.remove(val);
        list.set(index, list.get(lastIndex));
        map.put(list.get(lastIndex), index);
        list.remove(lastIndex);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(map.size());
        return list.get(randomIndex);
    }

}
