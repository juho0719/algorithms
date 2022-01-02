package com.juho.leetCode.challenge.y2021.month10.day31;

import com.juho.leetCode.datastructure.Node2;

/**
 * You are given a doubly linked list which in addition to the next and previous pointers, 
 * it could have a child pointer, which may or may not point to a separate doubly linked list. 
 * These child lists may have one or more children of their own, and so on, 
 * to produce a multilevel data structure, as shown in the example below.
 * Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.
 * 
 * Example 1: 
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 * 
 * Example 2: 
 * Input: head = [1,2,null,3]
 * Output: [1,3,2]
 * 
 * Constraints: 
 * The number of Nodes will not exceed 1000.
 * 1 <= Node.val <= 10^5
 */
public class FlattenaMultilevelDoublyLinkedList {
    public Node2 flatten(Node2 head) {
        if( head == null) return head;
        Node2 p = head; 
        while( p!= null) {
            if( p.child == null ) {
                p = p.next;
                continue;
            }
            Node2 temp = p.child;
            while( temp.next != null ) 
                temp = temp.next;
    
            temp.next = p.next;  
            if( p.next != null )  p.next.prev = temp;
            p.next = p.child; 
            p.child.prev = p;
            p.child = null;
        }
        return head;
    }
}