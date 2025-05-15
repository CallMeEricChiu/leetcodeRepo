package com.algori.question.classic150;

import java.util.PriorityQueue;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number179 {

    public String largestNumber(int[] nums) {
        PriorityQueue<String> heap = new PriorityQueue<>((x, y) -> (y + x).compareTo(x + y));
        for(int x: nums) {
            heap.offer(String.valueOf(x));
        }
        StringBuilder res = new StringBuilder();
        while(!heap.isEmpty()) {
            res.append(heap.poll());
        }
        if(res.charAt(0) == '0') {
            return "0";
        }
        return res.toString();
    }
}
