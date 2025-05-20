package com.algori.question.classic150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number61 {

    public ListNode rotateRight(ListNode head, int k) {
        ListNode node = head;
        int nodeNum = 0;
        while(node != null) {
            nodeNum++;
            node = node.next;
        }
        if(nodeNum == k) {
            return head;
        }
        k = nodeNum - k % nodeNum;
        ListNode cur = head;
        for(int i = 1;i< k;i++) {
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        cur = newHead;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }
}
