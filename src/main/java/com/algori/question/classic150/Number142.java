package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        int steps = 0;
        ListNode slow = head, fast = head.next.next;
        while(fast != slow) {
            if(fast== null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            steps++;
        }
        ListNode node = head;
        while(slow != node) {
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
}
