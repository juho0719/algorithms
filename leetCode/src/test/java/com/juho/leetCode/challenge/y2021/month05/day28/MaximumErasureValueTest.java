package com.juho.leetCode.challenge.y2021.month05.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumErasureValueTest {
    
    MaximumErasureValue mev = new MaximumErasureValue();

    @Test
    public void maximumErasureValue01Test() {
        int[] nums01 = {4,2,4,5,6};
        assertEquals(17, mev.maximumUniqueSubarray(nums01));

        int[] nums02 = {5,2,1,2,5,2,1,2,5};
        assertEquals(8, mev.maximumUniqueSubarray(nums02));
    }
}