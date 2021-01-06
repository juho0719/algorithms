package com.juho.leetCode.decemberLeetCodingChallenge.day05;

public class RemoveDuplicatesFromSortedList02 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        Map<Integer, Integer> dupCntMap = new LinkedHashMap<>();
        checkDuplicates(dupCntMap, head);

        ListNode result = null;
        for(Map.Entry<Integer, Integer> entry : dupCntMap.entrySet()) {
            if(entry.getValue() == 1) {
                if(result == null) {
                    result = new ListNode(entry.getKey());
                } else {
                    setListNode(result, entry.getKey());
                }
            }
        }
        return result;
    }

    private void checkDuplicates(Map<Integer, Integer> dupCntMap, ListNode head) {
        if(head == null) return;

        dupCntMap.put(head.val, dupCntMap.get(head.val)==null?1:dupCntMap.get(head.val)+1);
        checkDuplicates(dupCntMap, head.next);
    }

    private void setListNode(ListNode listNode, int val) {
        if(listNode.next == null) {
            listNode.next = new ListNode(val);
        } else {
            setListNode(listNode.next, val);
        }
    }
}