package com.juho.leetCode.aprilLeetCodingChallenge.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OnesAndZeroesTest {
    
    OnesAndZeroes oz = new OnesAndZeroes();

    @Test
    public void onesAndZeroes01Test() {
        String[] strs01 = {"10", "0001", "111001", "1", "0"};
        int m01 = 5;
        int n01 = 3;
        assertEquals(4, oz.findMaxForm(strs01, m01, n01));

        String[] strs02 = {"10", "0", "1"};
        int m02 = 1;
        int n02 = 1;
        assertEquals(2, oz.findMaxForm(strs02, m02, n02));
    }
}
