package com.algori.question.classic150;

import javafx.util.Pair;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class NumberLCR155 {

    public Node treeToDoublyList(Node root) {
        if(root == null) {
            return null;
        }
        Pair<Node, Node> res = inOderRecurse(root);
        Node head = res.getKey();
        Node tail = res.getValue();
        head.left = tail;
        tail.right = head;
        return head;
    }

    private Pair<Node, Node> inOderRecurse(Node node) {
        if(node == null) {
            return new Pair<>(null, null);
        }

        Pair<Node, Node> leftListPair = inOderRecurse(node.left);
        Node leftHead = leftListPair.getKey();
        Node leftTail = leftListPair.getValue();
        if(leftTail != null) {
            leftTail.right = node;
            node.left = leftTail;
        }

        Pair<Node, Node> rightListPair = inOderRecurse(node.right);
        Node rightHead = rightListPair.getKey();
        Node rightTail = rightListPair.getValue();
        if(rightHead != null) {
            rightHead.left = node;
            node.right = rightHead;
        }

        if(leftHead == null && rightTail == null) {
            return new Pair<>(node, node);
        } else if(leftHead == null) {
            return new Pair<>(node, rightTail);
        } else if(rightTail == null) {
            return new Pair<>(leftHead, node);
        }
        return new Pair<>(leftHead, rightTail);
    }
}
