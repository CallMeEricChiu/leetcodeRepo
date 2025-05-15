package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        ListNode last = head;
        for(int i = 0; i < n - 1; i++) {
            last = last.next;
        }
        while(last.next != null) {
            last = last.next;
            cur = cur.next;
            prev = prev.next;
        }

        prev.next = cur.next;
        cur.next = null;
        return dummy.next;
    }
}
