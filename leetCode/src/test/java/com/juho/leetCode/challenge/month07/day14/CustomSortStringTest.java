package com.juho.leetCode.challenge.month07.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CustomSortStringTest {

    CustomSortString css = new CustomSortString();

    @Test
    public void customSortString01Test() {
        String order01 = "cba";
        String s01 = "abcd";
        assertEquals("cbad", css.customSortString(order01, s01));

        String order02 = "cbafg";
        String s02 = "abcd";
        assertEquals("cbad", css.customSortString(order02, s02));
    }

}
