package com.juho.leetCode.challenge.month11.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplyStringsTest {

    MultiplyStrings ms = new MultiplyStrings();

    @Test
    public void multiplyStrings01Test() {
        String num101 = "2";
        String num102 = "3";
        assertEquals("6", ms.multiply(num101, num102));

        String num201 = "123";
        String num202 = "456";
        assertEquals("56088", ms.multiply(num201, num202));
    }
}