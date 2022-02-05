package com.juho.leetCode.challenge.y2022.month02.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.juho.leetCode.datastructure.ListNode;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * 
 * Example 2:
 * Input: lists = []
 * Output: []
 * 
 * Constraints:
 * k == lists.length
 * 0 <= k <= 10^4
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length won't exceed 10^4.
 */

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> l = new ArrayList<>();
        for(ListNode list : lists){
            while(list != null){
                l.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(l);
        for(int val : l){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }
}