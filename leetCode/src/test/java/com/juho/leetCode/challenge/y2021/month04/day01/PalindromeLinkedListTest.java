package com.juho.leetCode.challenge.y2021.month04.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;

import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {
    
    PalindromeLinkedList pl = new PalindromeLinkedList();

    @Test
    public void distributeCandies01Test() {
        ListNode head101 = new ListNode(1);
        ListNode head102 = new ListNode(2);
        ListNode head103 = new ListNode(2);
        ListNode head104 = new ListNode(1);
        head101.next = head102;
        head102.next = head103;
        head103.next = head104;
        assertEquals(true, pl.isPalindrome(head101));

        ListNode head201 = new ListNode(1);
        ListNode head202 = new ListNode(2);        
        head201.next = head202;
        assertEquals(false, pl.isPalindrome(head201));
    }
}
