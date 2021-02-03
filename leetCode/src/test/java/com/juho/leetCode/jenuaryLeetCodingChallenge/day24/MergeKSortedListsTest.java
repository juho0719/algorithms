package com.juho.leetCode.jenuaryLeetCodingChallenge.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class MergeKSortedListsTest {

    MergeKSortedLists mksl = new MergeKSortedLists();

    @Test
    public void determineIfTwoStringsAreClose01Test() {
        ListNode[] listNodes01 = {
            new ListNode(1, new ListNode(4, new ListNode(5))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(2, new ListNode(6)),
        };
        ListNode resultListNode01 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, 
        new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(6))))))));
        assertEquals(mksl.mergeKLists(listNodes01).toString(), resultListNode01.toString());

        ListNode[] listNodes02 = {
            null
        };
        ListNode resultListNode02 = null;
        assertEquals(mksl.mergeKLists(listNodes02), resultListNode02);

        ListNode[] listNodes03 = null;
        ListNode resultListNode03 = null;
        assertEquals(mksl.mergeKLists(listNodes03), resultListNode03);
    }
}