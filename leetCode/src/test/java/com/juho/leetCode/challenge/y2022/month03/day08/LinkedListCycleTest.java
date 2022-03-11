package com.juho.leetCode.challenge.y2022.month03.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    LinkedListCycle llc = new LinkedListCycle();

    @Test
    public void linkedListCycle01Test() {
        ListNode head01 = new ListNode(3);
        ListNode head02 = new ListNode(2);
        ListNode head03 = new ListNode(0);
        ListNode head04 = new ListNode(-4);
        head01.next = head02;
        head02.next = head03;
        head03.next = head04;
        head04.next = head02;
        assertEquals(true, llc.hasCycle(head01));
    }
}