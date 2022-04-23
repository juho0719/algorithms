package com.juho.leetCode.challenge.y2022.month04.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncodeAndDecodeTinyURLTest {

    EncodeAndDecodeTinyURL edt = new EncodeAndDecodeTinyURL();

    @Test
    public void encodeAndDecodeTinyURL01Test() {
        String longUrl01 = "http://naver.com/testcode";
        assertEquals(longUrl01, edt.decode(edt.encode(longUrl01)));
    }
}