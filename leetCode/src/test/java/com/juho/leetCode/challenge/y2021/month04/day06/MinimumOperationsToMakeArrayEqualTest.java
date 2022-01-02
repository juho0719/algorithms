package com.juho.leetCode.challenge.y2021.month04.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumOperationsToMakeArrayEqualTest {

    MinimumOperationsToMakeArrayEqual momae = new MinimumOperationsToMakeArrayEqual();

    @Test
    public void minimumOperationsToMakeArrayEqual01Test() {
        int n01 = 3;
        assertEquals(2, momae.minOperations(n01));

        int n02 = 6;
        assertEquals(9, momae.minOperations(n02));
    }
}
