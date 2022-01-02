package com.juho.leetCode.challenge.y2021.month10.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BitwiseANDofNumbersRangeTest {

    BitwiseANDofNumbersRange bnr = new BitwiseANDofNumbersRange();

    @Test
    public void bitwiseANDofNumbersRange01Test() {
        int left01 = 5;
        int right01 = 7;
        assertEquals(4, bnr.rangeBitwiseAnd(left01, right01));

        int left02 = 0;
        int right02 = 0;
        assertEquals(0, bnr.rangeBitwiseAnd(left02, right02));

        int left03 = 1;
        int right03 = 2147483647;
        assertEquals(0, bnr.rangeBitwiseAnd(left03, right03));
    }
}