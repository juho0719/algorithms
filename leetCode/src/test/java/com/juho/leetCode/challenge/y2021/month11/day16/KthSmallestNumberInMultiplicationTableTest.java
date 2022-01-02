package com.juho.leetCode.challenge.y2021.month11.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KthSmallestNumberInMultiplicationTableTest {

    KthSmallestNumberInMultiplicationTable ksnmt = new KthSmallestNumberInMultiplicationTable();

    @Test
    public void kthSmallestNumberInMultiplicationTable01Test() {
        int m01 = 3;
        int n01 = 3;
        int k01 = 5;
        assertEquals(3, ksnmt.findKthNumber(m01, n01, k01));

        int m02 = 2;
        int n02 = 3;
        int k02 = 6;
        assertEquals(6, ksnmt.findKthNumber(m02, n02, k02));
    }
}