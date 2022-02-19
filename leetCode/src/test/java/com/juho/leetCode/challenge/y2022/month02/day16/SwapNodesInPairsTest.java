package com.juho.leetCode.challenge.y2022.month02.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {

    SwapNodesInPairs snp = new SwapNodesInPairs();

    @Test
    public void swapNodesInPairs01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        ListNode head104 = new ListNode(4);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;

        ListNode result101 = new ListNode(2);
        ListNode result102 = new ListNode(1);
        ListNode result103 = new ListNode(4);
        ListNode result104 = new ListNode(3);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        assertEquals(result101.toString(), snp.swapPairs(head101));
    }
}