package com.juho.leetCode.challenge.y2021.month09.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BreakaPalindromeTest {

    BreakaPalindrome bp = new BreakaPalindrome();

    @Test
    public void breakaPalindrome01Test() {
        String palindrome01 = "abccba";
        assertEquals("aaccba", bp.breakPalindrome(palindrome01));

        String palindrome02 = "a";
        assertEquals("", bp.breakPalindrome(palindrome02));

        String palindrome03 = "aa";
        assertEquals("ab", bp.breakPalindrome(palindrome03));

        String palindrome04 = "aba";
        assertEquals("abb", bp.breakPalindrome(palindrome04));
    }
}