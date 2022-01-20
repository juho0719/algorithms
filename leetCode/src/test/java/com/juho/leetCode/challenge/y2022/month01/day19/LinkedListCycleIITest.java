package com.juho.leetCode.challenge.y2022.month01.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class LinkedListCycleIITest {
    
    LinkedListCycleII llc2 = new LinkedListCycleII();

    @Test
    public void linkedListCycleII01Test() {
        ListNode head101 = new ListNode(3);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(0);
        ListNode head104 = new ListNode(-4);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head102;
        assertEquals(head102, llc2.detectCycle(head101));
    }
}