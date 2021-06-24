package com.juho.leetCode.challenge.month06.day23;

import com.juho.leetCode.datastructure.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
     
        if (head == null) {
            return null;
        }

        ListNode cur = head, prev = null;
        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }

        ListNode con = prev, tail = cur;
        ListNode third = null;
        while (right > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            right--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}