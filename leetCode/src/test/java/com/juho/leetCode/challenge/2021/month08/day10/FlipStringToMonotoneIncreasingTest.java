package com.juho.leetCode.challenge.month08.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FlipStringToMonotoneIncreasingTest {

    FlipStringToMonotoneIncreasing fsmi = new FlipStringToMonotoneIncreasing();

    @Test
    public void flipStringToMonotoneIncreasing01Test() {
        String s01 = "00110";
        assertEquals(1, fsmi.minFlipsMonoIncr(s01));

        String s02 = "010110";
        assertEquals(2, fsmi.minFlipsMonoIncr(s02));

        String s03 = "00011000";
        assertEquals(2, fsmi.minFlipsMonoIncr(s03));
    }
}
