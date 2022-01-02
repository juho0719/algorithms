package com.juho.leetCode.challenge.y2021.month03.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemovePalindromicSubsequencesTest {
    
    RemovePalindromicSubsequences rps = new RemovePalindromicSubsequences();

    @Test
    public void removePalindromicSubsequences01Test() {
        String s01 = "ababa";
        assertEquals(rps.removePalindromeSub(s01), 1);

        String s02 = "abb";
        assertEquals(rps.removePalindromeSub(s02), 2);

        String s03 = "baabb";
        assertEquals(rps.removePalindromeSub(s03), 2);

        String s04 = "";
        assertEquals(rps.removePalindromeSub(s04), 0);
    }
}
