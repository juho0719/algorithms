package com.juho.leetCode.challenge.y2021.month09.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DistinctSubsequencesTest {

    DistinctSubsequences ds = new DistinctSubsequences();

    @Test
    public void distinctSubsequences01Test() {
        String s01 = "rabbbit";
        String t01 = "rabbit";
        assertEquals(3, ds.numDistinct(s01, t01));

        String s02 = "babgbag";
        String t02 = "bag";
        assertEquals(5, ds.numDistinct(s02, t02));
    }
}