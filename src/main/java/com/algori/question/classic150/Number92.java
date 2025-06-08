package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for(int i = left ; i < right; i++) {
            ListNode next = cur.next;
            cur.next = next.next;
            pre.next = next;
            next.next = cur;
        }
        return dummy.next;
    }
}
