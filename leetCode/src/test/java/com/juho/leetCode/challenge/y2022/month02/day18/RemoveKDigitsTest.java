package com.juho.leetCode.challenge.y2022.month02.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveKDigitsTest {

    RemoveKDigits rd = new RemoveKDigits();

    @Test
    public void removeKDigits01Test() {
        String nums01 = "1432219";
        int k01 = 3;
        assertEquals("1219", rd.removeKdigits(nums01, k01));
    }
}