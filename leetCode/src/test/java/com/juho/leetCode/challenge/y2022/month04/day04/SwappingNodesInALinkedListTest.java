package com.juho.leetCode.challenge.y2022.month04.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class SwappingNodesInALinkedListTest {

    SwappingNodesInALinkedList snll = new SwappingNodesInALinkedList();

    @Test
    public void swappingNodesInALinkedList01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        ListNode head104 = new ListNode(4);
        ListNode head105 = new ListNode(5);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head105;
        int k01 = 2;

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(4);
        ListNode result103 = new ListNode(3);
        ListNode result104 = new ListNode(2);
        ListNode result105 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;

        assertEquals(result101.toString(), snll.swapNodes(head101, k01).toString());
    }
}