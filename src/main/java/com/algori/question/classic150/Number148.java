package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number148 {

    public ListNode sortList(ListNode head) {
        if(head == null) {
            return null;
        } else if(head.next == null){
            return head;
        } else if(head.next.next == null) {
            if(head.val > head.next.val){
                ListNode temp = head.next;
                head.next = null;
                temp.next = head;
                return temp;
            } else {
                return head;
            }
        }
        ListNode minNode = getMinNode(head);
        // midNode后面的链表断开
        ListNode nextListHead = minNode.next;
        minNode.next = null;

        ListNode preHead = sortList(head);
        ListNode nextHead = sortList(nextListHead);
        // 重新链接
        return mergeTwoLists(preHead, nextHead);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        while (curr.next != null) {
            curr = curr.next;
        }
        return dummy.next;
    }


    private ListNode getMinNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
