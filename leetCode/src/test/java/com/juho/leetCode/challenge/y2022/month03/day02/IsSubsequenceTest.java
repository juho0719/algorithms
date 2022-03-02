package com.juho.leetCode.challenge.y2022.month03.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    IsSubsequence is = new IsSubsequence();

    @Test
    public void isSubsequence01Test() {
        String s01 = "abc";
        String t01 = "ahbgdc";
        assertEquals(true, is.isSubsequence(s01, t01));

        String s02 = "axc";
        String t02 = "ahbgdc";
        assertEquals(false, is.isSubsequence(s02, t02));
    }
}