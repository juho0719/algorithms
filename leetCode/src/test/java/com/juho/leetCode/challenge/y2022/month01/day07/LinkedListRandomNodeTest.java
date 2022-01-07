package com.juho.leetCode.challenge.y2022.month01.day07;

import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class LinkedListRandomNodeTest {

    @Test
    public void linkedListRandomNode01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(3);
        head101.next = head102;
        head102.next = head103;
        LinkedListRandomNode llrn = new LinkedListRandomNode(head101);
        llrn.getRandom(); 
    }
}