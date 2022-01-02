package com.juho.leetCode.challenge.y2021.month08.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RangeAdditionIITest {

    RangeAdditionII ra2 = new RangeAdditionII();

    @Test
    public void rangeAdditionII01Test() {
        int m01 = 3;
        int n01 = 3;
        int[][] ops01 = {{2,2},{3,3}};
        assertEquals(4, ra2.maxCount(m01, n01, ops01));

        int m02 = 3;
        int n02 = 3;
        int[][] ops02 = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};
        assertEquals(4, ra2.maxCount(m02, n02, ops02));
    }
}