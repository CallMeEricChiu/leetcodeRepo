package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number82 {

    public static void main(String[] args) {
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        Number82 number82 = new Number82();
        ListNode node = number82.deleteDuplicates(node1);
        System.out.println(node);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-999);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        int preNodeVal = dummy.val;
        while(cur != null && cur.next != null) {
            if(cur.next.val == cur.val) {
                // 和next是重复节点,去掉
                preNodeVal = cur.val;
                prev.next = cur.next.next;
                cur.next.next = null;
                cur = prev.next;
            } else if(cur.val == preNodeVal) {
                // 和之前去掉的节点也重复，去掉
                prev.next = cur.next;
                cur.next = null;
                cur = prev.next;
                preNodeVal = -999;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(cur != null && cur.val == preNodeVal) {
            prev.next = null;
        }
        return dummy.next;
    }
}
