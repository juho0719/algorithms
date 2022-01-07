package com.juho.leetCode.challenge.y2022.month01.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PalindromePartitioningTest {

    PalindromePartitioning pp = new PalindromePartitioning();
    
    @Test
    public void palindromePartitioning01Test() {
        String s01 = "aab";
        List<List<String>> result100 = new ArrayList<>();
        List<String> result101 = new ArrayList<>();
        result101.add("a");
        result101.add("a");
        result101.add("b");
        result100.add(result101);
        List<String> result102 = new ArrayList<>();
        result102.add("aa");
        result102.add("b");
        result100.add(result102);
        assertEquals(result100, pp.partition(s01));
    }
}