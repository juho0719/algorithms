package com.juho.leetCode.marchLeetCodingChallenge.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReconstructOriginalDigitsFromEnglishTest {
    
    ReconstructOriginalDigitsFromEnglish rode = new ReconstructOriginalDigitsFromEnglish();

    @Test
    public void reconstructOriginalDigitsFromEnglish01Test() {
        String s01 = "owoztneoer";
        assertEquals("012", rode.originalDigits(s01));

        String s02 = "fviefuro";
        assertEquals("45", rode.originalDigits(s02));
    }
}
