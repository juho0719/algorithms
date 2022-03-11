package com.juho.leetCode.challenge.y2022.month03.day11;

import com.juho.leetCode.datastructure.ListNode;

/**
 * Given the head of a linked list, rotate the list to the right by k places.
 * 
 * Example 1:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 * 
 * Example 2:
 * Input: head = [0,1,2], k = 4
 * Output: [2,0,1]
 * 
 * Constraints:
 * The number of nodes in the list is in the range [0, 500].
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 10^9
 */

public class RotateList {
    public int getLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int len=getLength(head);
        k=k%len;
        ListNode fast=head,slow=head;
        while(k!=0){
           fast=fast.next;
            k--;
        } 
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;
        
        return head;
    }
}