package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                curr.next = list1;
                ListNode tmp = list1.next;
                list1.next = null;
                list1 = tmp;
            } else {
                curr.next = list2;
                ListNode tmp = list2.next;
                list2.next = null;
                list2 = tmp;
            }
            curr = curr.next;
        }
        if(list1 != null) {
            curr.next = list1;
        } else if(list2 != null) {
            curr.next = list2;
        }
        return dummy.next;
    }
}
