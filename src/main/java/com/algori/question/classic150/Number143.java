package com.algori.question.classic150;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number143 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        Number143 number143 = new Number143();
        number143.reorderList(head);
        System.out.println(number143.toString());
    }
    public void reorderList(ListNode head) {
        Deque<ListNode> listNodes = new LinkedList<>();
        ListNode cur = head.next;
        while (cur != null) {
            listNodes.add(cur);
            cur = cur.next;
        }

        cur = head;
        boolean reverseFlag = true;
        while(!listNodes.isEmpty()) {
            if(!reverseFlag) {
                cur.next = listNodes.pollFirst();
            } else {
                cur.next = listNodes.pollLast();
            }
            cur = cur.next;
            reverseFlag = !reverseFlag;
        }
        cur.next = null;
    }
}
