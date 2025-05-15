package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(head != null) {
            ListNode tail = pre;
            for(int i = 0; i < k; i++) {
                tail = tail.next;
                if(tail == null) {
                    return dummy.next;
                }
            }
            ListNode temp = tail.next;
            ListNode[] listNodes = reverseSubList(head, tail);
            head = listNodes[0];
            tail = listNodes[0];
            pre.next = head;
            tail.next = temp;

            pre = tail;
            head = temp;
        }
        return dummy.next;
    }

    public ListNode[] reverseSubList(ListNode head, ListNode tail) {
        ListNode cur = head;
        ListNode pre = tail.next;
        while (pre != tail) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return new ListNode[]{tail, head};
    }
}
