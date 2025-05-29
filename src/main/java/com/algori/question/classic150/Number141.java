package com.algori.question.classic150;

import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number141 {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fast = head, slow = head;
        do {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        } while(fast != null && fast.next != null);
        return false;
    }
}
