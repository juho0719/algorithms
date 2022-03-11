package com.juho.leetCode.challenge.y2022.month03.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListIITest {

    RemoveDuplicatesFromSortedListII rdsl2 = new RemoveDuplicatesFromSortedListII();

    @Test
    public void removeDuplicatesFromSortedListII01Test() {
        ListNode head01 = new ListNode(1);
        ListNode head02 = new ListNode(2);
        ListNode head03 = new ListNode(3);
        ListNode head04 = new ListNode(3);
        ListNode head05 = new ListNode(4);
        ListNode head06 = new ListNode(4);
        ListNode head07 = new ListNode(5);
        head01.next = head02;
        head02.next = head03;
        head03.next = head04;
        head04.next = head05;
        head05.next = head06;
        head06.next = head07;

        ListNode result01 = new ListNode(1);
        ListNode result02 = new ListNode(2);
        ListNode result03 = new ListNode(5);
        result01.next = result02;
        result02.next = result03;

        assertEquals(result01.toString(), rdsl2.deleteDuplicates(head01).toString());


    }
}