package com.juho.leetCode.decemberLeetCodingChallenge.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BeautifulArrangementTest {

    BeautifulArrangement ba = new BeautifulArrangement();

    @Test
    public void beautifulArrangement01Test() {
        assertEquals(ba.countArrangement(1), 1);
        assertEquals(ba.countArrangement(2), 2);
    }
}