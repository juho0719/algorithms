package com.juho.leetCode.challenge.y2022.month03.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class RotateListTest {

    RotateList rl = new RotateList();

    @Test
    public void rotateList01Test() {
        ListNode head01 = new ListNode(1);
        ListNode head02 = new ListNode(2);
        ListNode head03 = new ListNode(3);
        ListNode head04 = new ListNode(4);
        ListNode head05 = new ListNode(5);
        head01.next = head02;
        head02.next = head03;
        head03.next = head04;
        head04.next = head05;
        int k01 = 2;
        ListNode result01 = new ListNode(4);
        ListNode result02 = new ListNode(5);
        ListNode result03 = new ListNode(1);
        ListNode result04 = new ListNode(2);
        ListNode result05 = new ListNode(3);
        result01.next = result02;
        result02.next = result03;
        result03.next = result04;
        result04.next = result05;
        assertEquals(result01.toString(), rl.rotateRight(head01, k01).toString());
    }
}