package com.juho.leetCode.challenge.y2021.month08.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DecodeWaysTest {

    DecodeWays dw = new DecodeWays();

    @Test
    public void decodeWays01Test() {
        String s01 = "12";
        assertEquals(2, dw.numDecodings(s01));

        String s02 = "226";
        assertEquals(3, dw.numDecodings(s02));

        String s03 = "0";
        assertEquals(0, dw.numDecodings(s03));

        String s04 = "06";
        assertEquals(0, dw.numDecodings(s04));
    }
}
