package com.algori.question.classic150;

import java.util.ArrayDeque;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number200 {

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
        Number200 number200 = new Number200();
        int i = number200.numIslands(grid);
        System.out.println(i);
    }

    private static class Node {

        int row;
        int col;

        Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numIslands(char[][] grid) {
        int rowNum = grid.length;
        int colNum = grid[0].length;
        int res = 0;
        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, new Node(i, j));
                    res++;
                }
            }
        }
        return res;
    }

    private void bfs(char[][] grid, Node root) {
        int rowNum = grid.length;
        int colNum = grid[0].length;
        ArrayDeque<Node> nodes = new ArrayDeque<>();
        nodes.push(root);
        while(!nodes.isEmpty()) {
            Node node = nodes.poll();
            int row = node.row;
            int col = node.col;
            grid[row][col] = '2';
            // 上
            if(row > 0 && grid[row - 1][col] == '1') {
                nodes.push(new Node(row - 1, col));
            }
            // 下
            if(row < rowNum - 1 && grid[row + 1][col] == '1') {
                nodes.push(new Node(row + 1, col));
            }
            // 左
            if(col > 0 && grid[row][col - 1] == '1') {
                nodes.push(new Node(row, col - 1));
            }
            // 右
            if(col < colNum - 1 && grid[row][col + 1] == '1') {
                nodes.push(new Node(row, col + 1));
            }
        }
    }
}
