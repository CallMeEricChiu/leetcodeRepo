package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number56 {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])) ;
        for(int[] interval : intervals) {
            priorityQueue.offer(interval);
        }
        List<int[]> mergedInterval = new ArrayList<>();
        int[] newInterval = priorityQueue.poll();
        while(!priorityQueue.isEmpty()) {
            int[] interval = priorityQueue.poll();
            if(interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                mergedInterval.add(newInterval);
                newInterval = interval;
            }
        }
        mergedInterval.add(newInterval);
        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}
