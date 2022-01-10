package com.juho.leetCode.challenge.y2022.month01.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    AddBinary ab = new AddBinary();

    @Test
    public void addBinary01Test() {
        String a01 = "11";
        String b01 = "1";
        assertEquals("100", ab.addBinary(a01, b01));

        String a02 = "1010";
        String b02 = "1011";
        assertEquals("10101", ab.addBinary(a02, b02));
    }
}