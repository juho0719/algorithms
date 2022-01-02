package com.juho.leetCode.challenge.y2021.month06.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InterleavingStringTest {

    InterleavingString is = new InterleavingString();

    @Test
    public void interleavingString01Test() {
        String s101 = "aabcc";
        String s201 = "dbbca";
        String s301 = "aadbbcbcac";
        assertEquals(true, is.isInterleave(s101, s201, s301));

        String s102 = "aabcc";
        String s202 = "dbbca";
        String s302 = "aadbbbaccc";
        assertEquals(false, is.isInterleave(s102, s202, s302));

        String s103 = "";
        String s203 = "";
        String s303 = "";
        assertEquals(true, is.isInterleave(s103, s203, s303));
    }

}
