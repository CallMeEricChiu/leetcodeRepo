package com.algori.question.classic150;

import java.util.*;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number207 {
    public static void main(String[] args) {
        Number207 n = new Number207();
        int[][] prerequisites =  new int[][]{{0,1},{3,1},{1,3},{3,2}};
        boolean res = n.canFinish(3, prerequisites);
    }

    List<List<Integer>> edges;
    int[] visited;
    boolean valid = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        visited = new int[numCourses];
        for(int[] p : prerequisites) {
            edges.get(p[1]).add(p[0]);
        }

        for(int i = 0; i < numCourses && valid; i++) {
            if(visited[i] == 0) {
                dfs(i);
            }
        }
        return valid;
    }

    private void dfs(Integer id) {
        // 节点正在搜索中
        visited[id] = 1;
        for(int nextId : edges.get(id)) {
            if(visited[nextId] == 0) {
                dfs(nextId);
                if(!valid) {
                    return;
                }
            } else if(visited[nextId] == 1) {
                valid = false;
                return;
            }
        }
        // 节点搜索完成
        visited[id] = 2;
    }
}
