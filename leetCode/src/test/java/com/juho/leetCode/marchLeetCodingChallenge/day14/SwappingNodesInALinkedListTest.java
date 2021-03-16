package com.juho.leetCode.marchLeetCodingChallenge.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class SwappingNodesInALinkedListTest {
    
    SwappingNodesInALinkedList snl = new SwappingNodesInALinkedList();

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

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(4);
        ListNode result103 = new ListNode(3);
        ListNode result104 = new ListNode(2);
        ListNode result105 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        assertEquals(snl.swapNodes(head101, 2).toString(), result101.toString());


        ListNode head201 = new ListNode(7);
        ListNode head202 = new ListNode(9);
        ListNode head203 = new ListNode(6);
        ListNode head204 = new ListNode(6);
        ListNode head205 = new ListNode(7);
        ListNode head206 = new ListNode(8);
        ListNode head207 = new ListNode(3);
        ListNode head208 = new ListNode(0);
        ListNode head209 = new ListNode(9);
        ListNode head210 = new ListNode(5);
        head201.next = head202;
        head202.next = head203;
        head203.next = head204;
        head204.next = head205;
        head205.next = head206;
        head206.next = head207;
        head207.next = head208;
        head208.next = head209;
        head209.next = head210;

        ListNode result201 = new ListNode(7);
        ListNode result202 = new ListNode(9);
        ListNode result203 = new ListNode(6);
        ListNode result204 = new ListNode(6);
        ListNode result205 = new ListNode(8);
        ListNode result206 = new ListNode(7);
        ListNode result207 = new ListNode(3);
        ListNode result208 = new ListNode(0);
        ListNode result209 = new ListNode(9);
        ListNode result210 = new ListNode(5);
        result201.next = result202;
        result202.next = result203;
        result203.next = result204;
        result204.next = result205;
        result205.next = result206;
        result206.next = result207;
        result207.next = result208;
        result208.next = result209;
        result209.next = result210;
        assertEquals(snl.swapNodes(head201, 5).toString(), result201.toString());


        ListNode head301 = new ListNode(1);
        ListNode result301 = new ListNode(1);
        assertEquals(snl.swapNodes(head301, 1).toString(), result301.toString());


        ListNode head401 = new ListNode(1);
        ListNode head402 = new ListNode(2);
        head401.next = head402;

        ListNode result401 = new ListNode(2);
        ListNode result402 = new ListNode(1);
        result401.next = result402;
        assertEquals(snl.swapNodes(head401, 1).toString(), result401.toString());



        ListNode head501 = new ListNode(1);
        ListNode head502 = new ListNode(2);
        ListNode head503 = new ListNode(3);
        head501.next = head502;
        head502.next = head503;

        ListNode result501 = new ListNode(1);
        ListNode result502 = new ListNode(2);
        ListNode result503 = new ListNode(3);
        result501.next = result502;
        result502.next = result503;
        assertEquals(snl.swapNodes(head501, 2).toString(), result501.toString());
    }
}
