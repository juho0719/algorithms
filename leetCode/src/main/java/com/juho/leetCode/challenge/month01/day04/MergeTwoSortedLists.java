package com.juho.leetCode.challenge.month01.day04;

import com.juho.leetCode.datastructure.ListNode;

public class MergeTwoSortedLists {

    public ListNode getMergedList(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        if(l1 == null && l2 == null) return null;

        mergeTwoSortedLists(result, l1, l2);
        return result;
    }

    private void mergeTwoSortedLists(ListNode result, ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) {
            result.val = l2.val;
            if(l2.next != null) {
                result.next = new ListNode();
                mergeTwoSortedLists(result.next, l1, l2.next);
            }
            return;
        }
        if(l1 != null && l2 == null) {
            result.val = l1.val;
            if(l1.next != null) {
                result.next = new ListNode();
                mergeTwoSortedLists(result.next, l1.next, l2);
            }
            return;
        }

        if(l1.val <= l2.val) {
            result.val = l1.val;
            result.next = new ListNode();
            mergeTwoSortedLists(result.next, l1.next, l2);
        } else {
            result.val = l2.val;
            result.next = new ListNode();
            mergeTwoSortedLists(result.next, l1, l2.next);
        }
    }
}