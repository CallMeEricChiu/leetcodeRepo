package com.algori.question.classic150;

import javax.sound.sampled.Line;
import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number42 {
    public int trap(int[] height) {
        Deque<Integer> stack = new LinkedList<>();
        int res = 0;
        for(int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[i]) {
                Integer poll = stack.poll();
                if(stack.isEmpty()) {
                    break;
                }
                int width = i - poll - 1;
                int high = Math.min(height[stack.peek()], height[i]) - height[poll];
                res += width * high;
            }
            stack.push(i);
        }
        return res;
    }
}
