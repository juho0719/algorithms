package com.juho.leetCode.jenuaryLeetCodingChallenge.day12;

import com.juho.leetCode.jenuaryLeetCodingChallenge.datastructure.ListNode;

public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int upNum = 0;
        int newVal = l1.val + l2.val;
        if(newVal > 9) {
            upNum = 1;
            newVal = newVal - 10;
        }
        ListNode result = new ListNode(newVal);
        addTwoNumbersCal(result, l1.next, l2.next, upNum);
        return result;
    }

    private void addTwoNumbersCal(ListNode result, ListNode l1, ListNode l2, int upNum) {
        if(l1 == null && l2 == null) {
            if(upNum > 0) {
                result.next = new ListNode(upNum);
                return;
            }
        }

        if(l1 != null && l2 != null) {
            int newVal = l1.val + l2.val + upNum;
            if(newVal > 9) {
                upNum = 1;
                newVal = newVal - 10;
            } else {
                upNum = 0;
            }
            result.next = new ListNode(newVal);
            addTwoNumbersCal(result.next, l1.next, l2.next, upNum);
            return;
        }
        if(l1 != null && l2 == null) {
            int newVal = l1.val + upNum;
            if(newVal > 9) {
                upNum = 1;
                newVal = newVal - 10;
            } else {
                upNum = 0;
            }
            result.next = new ListNode(newVal);
            addTwoNumbersCal(result.next, l1.next, l2, upNum);
            return;
        }
        if(l1 == null && l2 != null) {
            int newVal = l2.val + upNum;
            if(newVal > 9) {
                upNum = 1;
                newVal = newVal - 10;
            } else {
                upNum = 0;
            }
            result.next = new ListNode(newVal);
            addTwoNumbersCal(result.next, l1, l2.next, upNum);
            return;
        }
    }
}