package com.juho.leetCode.challenge.y2022.month03.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmallestStringWithAGivenNumericValueTest {

    SmallestStringWithAGivenNumericValue ssgnv = new SmallestStringWithAGivenNumericValue();

    @Test
    public void smallestStringWithAGivenNumericValue01Test() {
        int n01 = 3;
        int k01 = 27;
        assertEquals("aay", ssgnv.getSmallestString(n01, k01));
    }
}