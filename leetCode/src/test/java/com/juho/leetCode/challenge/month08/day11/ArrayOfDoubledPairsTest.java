package com.juho.leetCode.challenge.month08.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayOfDoubledPairsTest {

    ArrayOfDoubledPairs adp = new ArrayOfDoubledPairs();

    @Test
    public void arrayOfDoubledPairs01Test() {
        int[] arr01 = {3,1,3,6};
        assertEquals(false, adp.canReorderDoubled(arr01));

        int[] arr02 = {2,1,2,6};
        assertEquals(false, adp.canReorderDoubled(arr02));

        int[] arr03 = {4,-2,2,-4};
        assertEquals(true, adp.canReorderDoubled(arr03));
    }
}
