package com.juho.leetCode.challenge.y2021.month02.day03;

import com.juho.leetCode.datastructure.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if(fast != null) {
                fast = fast.next;
            }

            if(slow == fast) return true;
        }
        return false;
    }
}
