package com.juho.leetCode.challenge.y2021.month04.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GlobalAndLocalInversionsTest {

    GlobalAndLocalInversions gli = new GlobalAndLocalInversions();

    @Test
    public void globalAndLocalInversions01Test() {
        int[] A01 = {1, 0, 2};
        assertEquals(true, gli.isIdealPermutation(A01));

        int[] A02 = {1, 2, 0};
        assertEquals(false, gli.isIdealPermutation(A02));
    }
}
