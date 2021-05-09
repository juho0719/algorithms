package com.juho.leetCode.mayLeetCodingChallenge.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SuperPalindromesTest {

    SuperPalindromes sp = new SuperPalindromes();

    @Test
    public void superPalindromes01Test() {
        String left01 = "4";
        String right01 = "1000";
        assertEquals(4, sp.superpalindromesInRange(left01, right01));

        String left02 = "1";
        String right02 = "2";
        assertEquals(1, sp.superpalindromesInRange(left02, right02));
    }

}
