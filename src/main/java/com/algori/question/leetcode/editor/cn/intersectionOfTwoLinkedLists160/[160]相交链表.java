package com.algori.question.leetcode.editor.cn.intersectionOfTwoLinkedLists160;
import com.algori.question.classic150.ListNode;
//leetcode submit region begin(Prohibit modification and deletion)



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        boolean flagA = true;
        boolean flagB = true;
        while(curA != null && curB != null) {
            if(curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
            if(curA == null && flagA) {
                curA = headB;
                flagA = false;
            }
            if(curB == null && flagB) {
                curB = headA;
                flagB = false;
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
