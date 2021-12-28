package com.juho.leetCode.challenge.month12.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedList mll = new MiddleOfTheLinkedList();

    @Test
    public void middleOfTheLinkedList01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        ListNode head104 = new ListNode(4);
        ListNode head105 = new ListNode(5);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head105;
        ListNode result101 = new ListNode(3);
        ListNode result102 = new ListNode(4);
        ListNode result103 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        assertEquals(result101.toString(), mll.middleNode(head101).toString());
    }
}