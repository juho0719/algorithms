package com.juho.leetCode.decemberLeetCodingChallenge.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers atn = new AddTwoNumbers();

    @Test
    public void mergeSortedArray01Test() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result01 = atn.addTwoNumbers(l1, l2);
        ListNode correctResult01 = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(result01, correctResult01);

        ListNode l11 = new ListNode(0);
        ListNode l12 = new ListNode(0);

        ListNode result11 = atn.addTwoNumbers(l11, l12);
        ListNode correctResult02 = new ListNode(0);
        assertEquals(result11, correctResult02);

        ListNode l21 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l22 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode result21 = atn.addTwoNumbers(l21, l22);
        ListNode correctResult03 = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        assertEquals(result21, correctResult03);
    }
}