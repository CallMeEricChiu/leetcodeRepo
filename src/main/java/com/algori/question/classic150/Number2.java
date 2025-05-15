package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int p = 0;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + p;
            ListNode node = new ListNode(sum % 10);
            p = sum / 10;
            curr.next = node;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null) {
            while(l1 != null) {
                int sum = l1.val + p;
                ListNode node = new ListNode(sum % 10);
                p = sum / 10;
                curr.next = node;
                curr = curr.next;
                l1 = l1.next;
            }
        } else if(l2 != null) {
            while(l2 != null) {
                int sum = l2.val + p;
                ListNode node = new ListNode(sum % 10);
                p = sum / 10;
                curr.next = node;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        if(p != 0) {
            curr.next = new ListNode(p);
        }
        return dummy.next;
    }
}
