package com.juho.leetCode.challenge.y2022.month02.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContiguousArrayTest {

    ContiguousArray ca = new ContiguousArray();

    @Test
    public void contiguousArray01Test() {
        int[] nums01 = {0,1};
        assertEquals(2, ca.findMaxLength(nums01));

        int[] nums02 = {0,1,0};
        assertEquals(2, ca.findMaxLength(nums02));
    }
}