package com.juho.leetCode.challenge.y2022.month04.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void reverseString01Test() {
        char[] s01 = {'h','e','l','l','o'};
        char[] result01 = {'o','l','l','e','h'};
        rs.reverseString(s01);
        assertArrayEquals(result01, s01);
    }
}