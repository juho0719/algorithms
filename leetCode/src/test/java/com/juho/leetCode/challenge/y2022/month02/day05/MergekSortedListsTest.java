package com.juho.leetCode.challenge.y2022.month02.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class MergekSortedListsTest {

    MergekSortedLists msl = new MergekSortedLists();

    @Test
    public void mergekSortedLists01Test() {
        ListNode[] lists01 = new ListNode[3];
        ListNode list101 = new ListNode(1);
        ListNode list102 = new ListNode(4);
        ListNode list103 = new ListNode(5);
        list101.next = list102;
        list102.next = list103;
        lists01[0] = list101;
        ListNode list111 = new ListNode(1);
        ListNode list112 = new ListNode(3);
        ListNode list113 = new ListNode(4);
        list111.next = list112;
        list112.next = list113;
        lists01[1] = list111;
        ListNode list121 = new ListNode(2);
        ListNode list122 = new ListNode(6);
        list121.next = list122;
        lists01[2] = list121;

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(1);
        ListNode result103 = new ListNode(2);
        ListNode result104 = new ListNode(3);
        ListNode result105 = new ListNode(4);
        ListNode result106 = new ListNode(4);
        ListNode result107 = new ListNode(5);
        ListNode result108 = new ListNode(6);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        result105.next = result106;
        result106.next = result107;
        result107.next = result108;

        assertEquals(result101.toString(), msl.mergeKLists(lists01).toString());
    }
}