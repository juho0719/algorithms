package com.juho.leetCode.challenge.y2021.month02.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {
    
    LinkedListCycle llc = new LinkedListCycle();

    @Test
    public void linkedListCycle01Test() {
        ListNode head01Node01 = new ListNode(3);
        ListNode head01Node02 = new ListNode(2);
        ListNode head01Node03 = new ListNode(0);
        ListNode head01Node04 = new ListNode(-4);
        head01Node01.next = head01Node02;
        head01Node02.next = head01Node03;
        head01Node03.next = head01Node04;
        head01Node04.next = head01Node02;
        assertEquals(llc.hasCycle(head01Node01), true);
    }
}
