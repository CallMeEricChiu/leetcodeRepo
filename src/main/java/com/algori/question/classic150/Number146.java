package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number146 {

    static class Node {

        int key;
        int value;
        Node pre;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    private final int capacity;

    public Number146(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            moveNodeToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveNodeToHead(node);
        } else {
            if(map.size() >= capacity) {
                Node tail = this.tail.pre;
                removeNode(tail);
                map.remove(tail.key);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            addNodeToHead(node);
        }
    }

    private void addNodeToHead(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void moveNodeToHead(Node node) {
        removeNode(node);
        addNodeToHead(node);
    }


    private void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}
