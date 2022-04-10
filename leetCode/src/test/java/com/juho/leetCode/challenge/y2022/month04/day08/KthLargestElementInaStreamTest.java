package com.juho.leetCode.challenge.y2022.month04.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KthLargestElementInaStreamTest {

    @Test
    public void kthLargestElementInaStream01Test() {
        int[] nums01 = {4,5,8,2};
        KthLargestElementInaStream kles = new KthLargestElementInaStream(3, nums01);
        assertEquals(4, kles.add(3));
        assertEquals(5, kles.add(5));
        assertEquals(5, kles.add(10));
        assertEquals(8, kles.add(9));
        assertEquals(8, kles.add(4));
    }
}