package com.juho.leetCode.challenge.y2022.month02.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindAllAnagramsInaStringTest {

    FindAllAnagramsInaString fas = new FindAllAnagramsInaString();

    @Test
    public void findAllAnagramsInaString01Test() {
        String s01 = "cbaebabacd";
        String p01 = "abc";
        List<Integer> result01 = new ArrayList<>();
        result01.add(0);
        result01.add(6);
        assertEquals(result01, fas.findAnagrams(s01, p01));
    }
}