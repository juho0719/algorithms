package com.juho.leetCode.decemberLeetCodingChallenge.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmallestStringWithAGivenNumericValueTest {

    SmallestStringWithAGivenNumericValue cocbn = new SmallestStringWithAGivenNumericValue();

    @Test
    public void smallestStringWithAGivenNumericValue01Test() {
        int n01 = 3;
        int k01 = 27;
        assertEquals(cocbn.getSmallestString(n01, k01), "aay");

        int n02 = 5;
        int k02 = 73;
        assertEquals(cocbn.getSmallestString(n02, k02), "aaszz");
    }
}