package com.juho.leetCode.challenge.y2021.month08.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComplexNumberMultiplicationTest {

    ComplexNumberMultiplication cnm = new ComplexNumberMultiplication();

    @Test
    public void complexNumberMultiplication01Test() {
        String num11 = "1+1i";
        String num12 = "1+1i";
        assertEquals("0+2i", cnm.complexNumberMultiply(num11, num12));

        String num21 = "1+-1i";
        String num22 = "1+-1i";
        assertEquals("0+-2i", cnm.complexNumberMultiply(num21, num22));
    }
}