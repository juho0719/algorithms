package com.juho.leetCode.challenge.y2021.month08.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddStringsTest {

    AddStrings as = new AddStrings();

    @Test
    public void rankTransformOfaMatrix01Test() {
        String num101 = "11";
        String num102 = "123";
        assertEquals("134", as.addStrings(num101, num102));

        String num201 = "456";
        String num202 = "77";
        assertEquals("533", as.addStrings(num201, num202));

        String num301 = "0";
        String num302 = "0";
        assertEquals("0", as.addStrings(num301, num302));
    }
}
