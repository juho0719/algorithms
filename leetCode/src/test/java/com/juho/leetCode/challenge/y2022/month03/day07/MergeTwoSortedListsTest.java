package com.juho.leetCode.challenge.y2022.month03.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

    @Test
    public void mergeTwoSortedLists01Test() {
        ListNode list101 = new ListNode(1);
        ListNode list102 = new ListNode(2);
        ListNode list103 = new ListNode(4);
        list101.next = list102;
        list102.next = list103;
        ListNode list201 = new ListNode(1);
        ListNode list202 = new ListNode(3);
        ListNode list203 = new ListNode(4);
        list201.next = list202;
        list202.next = list203;

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(1);
        ListNode result103 = new ListNode(2);
        ListNode result104 = new ListNode(3);
        ListNode result105 = new ListNode(4);
        ListNode result106 = new ListNode(4);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        result105.next = result106;
        assertEquals(result101.toString(), mtsl.mergeTwoLists(list101, list201).toString());
    }
}