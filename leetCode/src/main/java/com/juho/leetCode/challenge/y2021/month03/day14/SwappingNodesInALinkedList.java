package com.juho.leetCode.challenge.y2021.month03.day14;

import com.juho.leetCode.datastructure.ListNode;

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        k = k-1;
        ListNode firstN = head;
        while(k>0){
            firstN = firstN.next;
            k--;
        }

        ListNode f = firstN;
        ListNode secondN = head;
        while(f.next!=null){
            secondN = secondN.next;
            f = f.next;
        }

        int temp = firstN.val;
        firstN.val = secondN.val;
        secondN.val = temp;

        return head;
    }
}