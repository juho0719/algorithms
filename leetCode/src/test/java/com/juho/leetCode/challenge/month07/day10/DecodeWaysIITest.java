package com.juho.leetCode.challenge.month07.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DecodeWaysIITest {

    DecodeWaysII dw2 = new DecodeWaysII();

    @Test
    public void decodeWaysII01Test() {
        String s01 = "*";
        assertEquals(9, dw2.numDecodings(s01));

        String s02 = "1*";
        assertEquals(18, dw2.numDecodings(s02));

        String s03 = "2*";
        assertEquals(15, dw2.numDecodings(s03));
    }

}
