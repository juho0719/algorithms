package com.juho.leetCode.challenge.y2021.month12.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {

    OddEvenLinkedList oell = new OddEvenLinkedList();

    @Test
    public void oddEvenLinkedList01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        ListNode head104 = new ListNode(4);
        ListNode head105 = new ListNode(5);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        head104.next = head105;
        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(3);
        ListNode result103 = new ListNode(5);
        ListNode result104 = new ListNode(2);
        ListNode result105 = new ListNode(4);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        assertEquals(result101.toString(), oell.oddEvenList(head101).toString());
        
        ListNode head201 = new ListNode(2);
        ListNode head202 = new ListNode(1);
        ListNode head203 = new ListNode(3);
        ListNode head204 = new ListNode(5);
        ListNode head205 = new ListNode(6);
        ListNode head206 = new ListNode(4);
        ListNode head207 = new ListNode(7);
        head201.next = head202;
        head202.next = head203;
        head203.next = head204;
        head204.next = head205;
        head205.next = head206;
        head206.next = head207;
        ListNode result201 = new ListNode(2);
        ListNode result202 = new ListNode(3);
        ListNode result203 = new ListNode(6);
        ListNode result204 = new ListNode(7);
        ListNode result205 = new ListNode(1);
        ListNode result206 = new ListNode(5);
        ListNode result207 = new ListNode(4);
        result201.next = result202;
        result202.next = result203;
        result203.next = result204;
        result204.next = result205;
        result205.next = result206;
        result206.next = result207;
        assertEquals(result201.toString(), oell.oddEvenList(head201).toString());
    }
}