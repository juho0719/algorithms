package com.juho.leetCode.challenge.y2022.month02.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimizeDeviationInArrayTest {

    MinimizeDeviationInArray mda = new MinimizeDeviationInArray();

    @Test
    public void minimizeDeviationInArray01Test() {
        int[] nums01 = {1,2,3,4};
        assertEquals(1, mda.minimumDeviation(nums01));
    }
}