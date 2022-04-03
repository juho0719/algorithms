package com.juho.leetCode.challenge.y2022.month04.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidPalindromeIITest {

    ValidPalindromeII vp2 = new ValidPalindromeII();

    @Test
    public void validPalindromeII01Test() {
        String s01 = "aba";
        assertEquals(true, vp2.validPalindrome(s01));
    }
}