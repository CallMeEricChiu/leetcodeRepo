package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next = head.next;
        while(next != null) {
            ListNode nextCurr = next.next;
            next.next = curr;
            curr.next = nextCurr;
            prev.next = next;

            curr = prev.next;
            next = prev.next.next;

            prev = prev.next.next;
            curr = curr.next.next;
            next = next.next == null ? null : next.next.next;
        }
        return dummy.next;
    }
}
