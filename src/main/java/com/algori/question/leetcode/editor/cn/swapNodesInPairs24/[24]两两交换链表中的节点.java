package com.algori.question.leetcode.editor.cn.swapNodesInPairs24;
import com.algori.question.classic150.ListNode;
//leetcode submit region begin(Prohibit modification and deletion)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode tail = head.next;
        while(tail != null) {
            ListNode newNext = tail.next;
            ListNode newHead = reverse(pre.next, tail);
            ListNode newTail = pre.next;
            newTail.next = newNext;
            pre.next = newHead;

            tail = newTail;
            if(tail.next != null && tail.next.next != null) {
                pre = pre.next.next;
                tail = tail.next.next;
            } else {
                break;
            }
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode cur = head;
        // ListNode pre = tail;
        while(cur != tail) {
            ListNode next = cur.next;

            ListNode tmp = tail.next;
            tail.next = cur;
            cur.next = tmp;

            cur = next;
        }
        return tail;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
