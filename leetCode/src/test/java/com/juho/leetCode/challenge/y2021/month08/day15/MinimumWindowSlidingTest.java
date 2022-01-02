package com.juho.leetCode.challenge.y2021.month08.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumWindowSlidingTest {

    MinimumWindowSliding mws = new MinimumWindowSliding();

    @Test
    public void minimumWindowSliding01Test() {
        String s01 = "ADOBECODEBANC";
        String t01 = "ABC";
        assertEquals("BANC", mws.minWindow(s01, t01));
    }
}
