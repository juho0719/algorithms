package com.juho.leetCode.marchLeetCodingChallenge.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncodeAndDecodeTinyURLTest {
    
    EncodeAndDecodeTinyURL edt = new EncodeAndDecodeTinyURL();

    @Test
    public void encodeAndDecodeTinyURL01Test() {
        String url01 = "https://leetcode.com/problems/design-tinyurl";
        String encode01 = edt.encode(url01);
        String decode01 = edt.decode(encode01);
        assertEquals(url01, decode01);
    }
}
