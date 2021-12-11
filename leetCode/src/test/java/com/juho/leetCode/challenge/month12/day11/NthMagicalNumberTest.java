package com.juho.leetCode.challenge.month12.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NthMagicalNumberTest {

    NthMagicalNumber nmn = new NthMagicalNumber();

    @Test
    public void nthMagicalNumber01Test() {
        int n01 = 1;
        int a01 = 2;
        int b01 = 3;
        int result01 = 2;
        assertEquals(result01, nmn.nthMagicalNumber(n01, a01, b01));

        int n02 = 4;
        int a02 = 2;
        int b02 = 3;
        int result02 = 6;
        assertEquals(result02, nmn.nthMagicalNumber(n02, a02, b02));

        int n03 = 5;
        int a03 = 2;
        int b03 = 4;
        int result03 = 10;
        assertEquals(result03, nmn.nthMagicalNumber(n03, a03, b03));

        int n04 = 3;
        int a04 = 6;
        int b04 = 4;
        int result04 = 8;
        assertEquals(result04, nmn.nthMagicalNumber(n04, a04, b04));
    }
}