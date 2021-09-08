package com.juho.leetCode.challenge.month09.day07;

import com.juho.leetCode.datastructure.ListNode;

public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}