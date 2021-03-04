package com.juho.leetCode.marchLeetCodingChallenge.day04;

import com.juho.leetCode.datastructure.ListNode;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b) {
            a = a == null? headB: a.next;
            b = b == null? headA: b.next;
        }
        return a;
    }
}