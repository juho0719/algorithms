package com.juho.leetCode.challenge.month04.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList rnnfel = new RemoveNthNodeFromEndOfList();

    @Test
    public void removeNthNodeFromEndOfList01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        ListNode head104 = new ListNode(4);
        ListNode head105 = new ListNode(5);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head105;
        int n01 = 2;
        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(2);
        ListNode result103 = new ListNode(3);
        ListNode result104 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        assertEquals(result101.toString(), rnnfel.removeNthFromEnd(head101, n01).toString());

        ListNode head201 = new ListNode(1);
        int n02 = 1;
        assertEquals(null, rnnfel.removeNthFromEnd(head201, n02));

        ListNode head301 = new ListNode(1);
        ListNode head302 = new ListNode(2);
        head301.next = head302;
        int n03 = 1;
        ListNode result301 = new ListNode(1);
        assertEquals(result301.toString(), rnnfel.removeNthFromEnd(head301, n03).toString());
    }
}
