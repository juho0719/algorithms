package com.juho.leetCode.challenge.y2021.month01.day24;

import java.util.PriorityQueue;

import com.juho.leetCode.datastructure.ListNode;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode listNode : lists) {
            if(listNode != null) {
                setPriorityQueue(pq, listNode);
            }
        }
        if(pq.isEmpty()) return null;
        
        ListNode result = new ListNode(pq.poll());
        if(!pq.isEmpty()) {
            setListNode(pq, result);
        }
        return result;
    }

    private void setPriorityQueue(PriorityQueue<Integer> pq, ListNode listNode) {
        pq.offer(listNode.val);
        if(listNode.next != null) setPriorityQueue(pq, listNode.next);
    }

    private void setListNode(PriorityQueue<Integer> pq, ListNode result) {
        result.next = new ListNode(pq.poll());
        if(!pq.isEmpty()) setListNode(pq, result.next);
    }
}
