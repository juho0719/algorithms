package com.juho.leetCode.challenge.y2022.month05.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BackspaceStringCompareTest {

    BackspaceStringCompare bsc = new BackspaceStringCompare();

    @Test
    public void evaluateDivision01Test() {
        String s01 = "ab#c";
        String t01 = "ad#c";
        assertEquals(true, bsc.backspaceCompare(s01, t01));
    }
}