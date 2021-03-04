package com.juho.leetCode.marchLeetCodingChallenge.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedListsTest {
    
    IntersectionOfTwoLinkedLists itl = new IntersectionOfTwoLinkedLists();

    @Test
    public void intersectionOfTwoLinkedLists01Test() {
        ListNode node101 = new ListNode(4);
        ListNode node102 = new ListNode(1);
        ListNode node103 = new ListNode(5);
        ListNode node104 = new ListNode(6);
        ListNode node105 = new ListNode(1);
        ListNode node106 = new ListNode(8);
        ListNode node107 = new ListNode(4);
        ListNode node108 = new ListNode(5);
        node101.next = node102;
        node102.next = node106;
        node103.next = node104;
        node104.next = node105;
        node105.next = node106;
        node106.next = node107;
        node107.next = node108;
        assertEquals(itl.getIntersectionNode(node101, node104), node106);

        ListNode node201 = new ListNode(2);
        ListNode node202 = new ListNode(6);
        ListNode node203 = new ListNode(4);
        ListNode node204 = new ListNode(1);
        ListNode node205 = new ListNode(5);
        node201.next = node202;
        node202.next = node203;
        node204.next = node205;
        assertEquals(itl.getIntersectionNode(node201, node204), null);
    }
}
