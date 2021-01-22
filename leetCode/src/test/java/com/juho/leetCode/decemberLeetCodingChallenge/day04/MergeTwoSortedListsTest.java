package com.juho.leetCode.decemberLeetCodingChallenge.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.decemberLeetCodingChallenge.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

    @Test
    public void mergeTwoSortedLists01Test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode resultSample = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        assertEquals(mtsl.getMergedList(l1, l2).toString(), resultSample.toString());
    }
}