package com.juho.leetCode.challenge.y2022.month02.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindTheDifferenceTest {

    FindTheDifference fd = new FindTheDifference();

    @Test
    public void findTheDifference01Test() {
        String s01 = "abcd";
        String t01 = "abcde";
        assertEquals('e', fd.findTheDifference(s01, t01));
    }
}