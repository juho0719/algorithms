package com.juho.leetCode.challenge.month03.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CheckIfAStringContainsAllBinaryCodesOfSizeKTest {
    
    CheckIfAStringContainsAllBinaryCodesOfSizeK ciscabcsk = new CheckIfAStringContainsAllBinaryCodesOfSizeK();

    @Test
    public void checkIfAStringContainsAllBinaryCodesOfSizeK01Test() {
        String s01 = "00110110";
        int k01 = 2;
        assertEquals(ciscabcsk.hasAllCodes(s01, k01), true);

        String s02 = "00110";
        int k02 = 2;
        assertEquals(ciscabcsk.hasAllCodes(s02, k02), true);

        String s03 = "0110";
        int k03 = 1;
        assertEquals(ciscabcsk.hasAllCodes(s03, k03), true);

        String s04 = "0110";
        int k04 = 2;
        assertEquals(ciscabcsk.hasAllCodes(s04, k04), false);

        String s05 = "0000000001011100";
        int k05 = 4;
        assertEquals(ciscabcsk.hasAllCodes(s05, k05), false);
    }
}
