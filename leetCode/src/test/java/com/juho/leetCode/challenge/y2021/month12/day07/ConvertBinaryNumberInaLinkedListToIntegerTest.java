package com.juho.leetCode.challenge.y2021.month12.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class ConvertBinaryNumberInaLinkedListToIntegerTest {

    ConvertBinaryNumberInaLinkedListToInteger cbnli = new ConvertBinaryNumberInaLinkedListToInteger();

    @Test
    public void convertBinaryNumberInaLinkedListToInteger01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(0);
        ListNode head103 = new ListNode(1);
        head101.next = head102;
        head102.next = head103;
        assertEquals(5, cbnli.getDecimalValue(head101));

        ListNode head201 = new ListNode(0);
        assertEquals(0, cbnli.getDecimalValue(head201));

        ListNode head301 = new ListNode(1);
        assertEquals(1, cbnli.getDecimalValue(head301));

        ListNode head401 = new ListNode(1);
        ListNode head402 = new ListNode(0);
        ListNode head403 = new ListNode(0);
        ListNode head404 = new ListNode(1);
        ListNode head405 = new ListNode(0);
        ListNode head406 = new ListNode(0);
        ListNode head407 = new ListNode(1);
        ListNode head408 = new ListNode(1);
        ListNode head409 = new ListNode(1);
        ListNode head410 = new ListNode(0);
        ListNode head411 = new ListNode(0);
        ListNode head412 = new ListNode(0);
        ListNode head413 = new ListNode(0);
        ListNode head414 = new ListNode(0);
        ListNode head415 = new ListNode(0);
        head401.next = head402;
        head402.next = head403;
        head403.next = head404;
        head404.next = head405;
        head405.next = head406;
        head406.next = head407;
        head407.next = head408;
        head408.next = head409;
        head409.next = head410;
        head410.next = head411;
        head411.next = head412;
        head412.next = head413;
        head413.next = head414;
        head414.next = head415;
        assertEquals(18880, cbnli.getDecimalValue(head401));

        ListNode head501 = new ListNode(0);
        ListNode head502 = new ListNode(0);
        head501.next = head502;
        assertEquals(0, cbnli.getDecimalValue(head501));
    }
}