package com.juho.leetCode.challenge.month11.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class RemoveLinkedListElementsTest {

    RemoveLinkedListElements rlle = new RemoveLinkedListElements();

    @Test
    public void removeLinkedListElements01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(6);
        ListNode head104 = new ListNode(3);
        ListNode head105 = new ListNode(4);
        ListNode head106 = new ListNode(5);
        ListNode head107 = new ListNode(6);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head105;
        head105.next = head106;
        head106.next = head107;

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(2);
        ListNode result103 = new ListNode(3);
        ListNode result104 = new ListNode(4);
        ListNode result105 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        
        assertEquals(result101.toString(), rlle.removeElements(head101, 6).toString());
    }
}