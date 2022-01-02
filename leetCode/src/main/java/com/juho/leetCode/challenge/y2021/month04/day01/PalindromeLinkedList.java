package com.juho.leetCode.challenge.y2021.month04.day01;

import com.juho.leetCode.datastructure.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode left, right, middle, temp;
        left = head;
        right = head;
        while(right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
        }

        middle = left;
        left = left.next;
        middle.next = null;
        while(left != null) {
            temp = left.next;
            left.next = middle;
            middle = left;
            left = temp;
        }
        right = middle;
        left = head;

        while(right != null) {
            if(left.val != right.val) return false;
            right = right.next;
            left = left.next;
        }

        return true;
    }
}