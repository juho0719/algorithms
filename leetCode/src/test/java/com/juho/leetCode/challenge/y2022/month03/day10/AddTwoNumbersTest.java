package com.juho.leetCode.challenge.y2022.month03.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers atn = new AddTwoNumbers();

    @Test
    public void addTwoNumbers01Test() {
        ListNode l101 = new ListNode(2);
        ListNode l102 = new ListNode(4);
        ListNode l103 = new ListNode(3);
        l101.next = l102;
        l102.next = l103;
        ListNode l201 = new ListNode(5);
        ListNode l202 = new ListNode(6);
        ListNode l203 = new ListNode(4);
        l201.next = l202;
        l202.next = l203;
        ListNode result101 = new ListNode(7);
        ListNode result102 = new ListNode(0);
        ListNode result103 = new ListNode(8);
        result101.next = result102;
        result102.next = result103;
        assertEquals(result101.toString(), atn.addTwoNumbers(l101, l201).toString());

    }
}