package com.juho.leetCode.aprilLeetCodingChallenge.day23;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountBinarySubstringsTest {

    CountBinarySubstrings cbs = new CountBinarySubstrings();

    @Test
    public void countBinarySubstrings01Test() {
        String s01 = "00110011";
        assertEquals(6, cbs.countBinarySubstrings(s01));

        String s02 = "10101";
        assertEquals(4, cbs.countBinarySubstrings(s02));
    }
}
