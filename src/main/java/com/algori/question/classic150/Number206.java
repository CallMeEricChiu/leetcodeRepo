package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number206 {

    public static void main() {

    }

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode next = head.next;
        if(next == null) {
            return head;
        }
        head.next = null;
        // newHead是反转后的头节点，next是反转后的尾节点
        ListNode newHead = reverseList(next);
        next.next = head;
        return newHead;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
