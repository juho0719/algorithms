package com.juho.leetCode.challenge.y2022.month02.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PermutationInStringTest {

    PermutationInString ps = new PermutationInString();

    @Test
    public void permutationInString01Test() {
        String s101 = "ab";
        String s102 = "eidbaooo";
        assertEquals(true, ps.checkInclusion(s101, s102));

        String s201 = "ab";
        String s202 = "eidboaoo";
        assertEquals(false, ps.checkInclusion(s201, s202));
    }
}