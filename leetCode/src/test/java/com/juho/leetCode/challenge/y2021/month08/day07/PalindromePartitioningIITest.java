package com.juho.leetCode.challenge.y2021.month08.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromePartitioningIITest {

    PalindromePartitioningII pp2 = new PalindromePartitioningII();

    @Test
    public void palindromePartitioningII01Test() {
        String s01 = "aab";
        assertEquals(1, pp2.minCut(s01));

        String s02 = "a";
        assertEquals(0, pp2.minCut(s02));

        String s03 = "ab";
        assertEquals(1, pp2.minCut(s03));
    }
}
