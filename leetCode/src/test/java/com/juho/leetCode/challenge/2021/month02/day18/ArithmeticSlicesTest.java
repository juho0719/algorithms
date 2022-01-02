package com.juho.leetCode.challenge.month02.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArithmeticSlicesTest {
    
    ArithmeticSlices as = new ArithmeticSlices();

    @Test
    public void containerWithMostWater01Test() {
        int[] A01 = {1,3,5,7,9};
        assertEquals(as.numberOfArithmeticSlices(A01), 6);

        int[] A02 = {7,7,7,7};
        assertEquals(as.numberOfArithmeticSlices(A02), 3);

        int[] A03 = {1,2,3,4};
        assertEquals(as.numberOfArithmeticSlices(A03), 3);
    }
}
