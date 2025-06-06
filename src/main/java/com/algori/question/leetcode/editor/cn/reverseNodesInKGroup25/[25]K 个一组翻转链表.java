package com.algori.question.leetcode.editor.cn.reverseNodesInKGroup25;
import com.algori.question.classic150.ListNode;

import java.util.List;
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

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution solution = new Solution();
        ListNode node = solution.reverseKGroup(node1, 2);

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode tail = dummy;
        while(tail != null) {
            ListNode pre = tail;
            for(int i = 0; i < k; i++) {
                tail = tail.next;
                if(tail == null) {
                    return dummy.next;
                }
            }
            ListNode newTail = reverseSubList(pre.next, tail);
            pre.next = tail;
            tail = newTail;

        }
        return dummy.next;
    }

    public ListNode reverseSubList(ListNode head, ListNode tail) {
        ListNode cur = head;
        while(cur != null && cur != tail) {
            ListNode next = cur.next;
            ListNode temp = tail.next;
            tail.next = cur;
            cur.next = temp;

            cur = next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
