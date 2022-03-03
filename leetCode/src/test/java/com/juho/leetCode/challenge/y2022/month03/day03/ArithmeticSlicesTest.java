package com.juho.leetCode.challenge.y2022.month03.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArithmeticSlicesTest {

    ArithmeticSlices as = new ArithmeticSlices();

    @Test
    public void arithmeticSlices01Test() {
        int[] nums01 = {1,2,3,4};
        assertEquals(3, as.numberOfArithmeticSlices(nums01));
    }
}