package com.juho.leetCode.challenge.y2022.month02.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddDigitsTest {

    AddDigits ad = new AddDigits();

    @Test
    public void addDigits01Test() {
        int num01 = 38;
        assertEquals(2, ad.addDigits(num01));

        int num02 = 0;
        assertEquals(0, ad.addDigits(num02));
    }
}