package com.juho.leetCode.challenge.y2022.month04.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ThreeSumWithMultiplicityTest {

    ThreeSumWithMultiplicity tsm = new ThreeSumWithMultiplicity();

    @Test
    public void threeSumWithMultiplicity01Test() {
        int[] arr01 = {1,1,2,2,3,3,4,4,5,5};
        int target01 = 8;
        assertEquals(20, tsm.threeSumMulti(arr01, target01));
    }
}