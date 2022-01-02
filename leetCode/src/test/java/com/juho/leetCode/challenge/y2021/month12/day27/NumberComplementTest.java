package com.juho.leetCode.challenge.y2021.month12.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberComplementTest {

    NumberComplement nc = new NumberComplement();

    @Test
    public void numberComplement01Test() {
        int num01 = 5;
        assertEquals(2, nc.findComplement(num01));

        int num02 = 1;
        assertEquals(0, nc.findComplement(num02));
    }
}