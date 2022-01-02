package com.juho.leetCode.challenge.month01.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedList02Test {

    RemoveDuplicatesFromSortedList02 rdfsl2 = new RemoveDuplicatesFromSortedList02();

    @Test
    public void mergeTwoSortedLists01Test() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5)))))));

        ListNode l2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3)))));

        ListNode l3 = new ListNode(1, new ListNode(1));

        assertEquals(rdfsl2.deleteDuplicates(l1).toString(), new ListNode(1, new ListNode(2, new ListNode(5))).toString());
        assertEquals(rdfsl2.deleteDuplicates(l2).toString(), new ListNode(2, new ListNode(3)).toString());
        assertEquals(rdfsl2.deleteDuplicates(l3), null);
    }
}