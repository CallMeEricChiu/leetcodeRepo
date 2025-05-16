package com.algori.question.classic150;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public Node copyRandomList(Node head) {
        // oldNode -> newNode
        Map<Node, Node> nodeMap = new HashMap<>();
        Node cur = head;
        while(cur != null) {
            nodeMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null) {
            Node newNode = nodeMap.get(cur);
            newNode.next = nodeMap.get(cur.next);
            newNode.random = nodeMap.get(cur.random);
            cur = cur.next;
        }
        return nodeMap.get(head);
    }
}
