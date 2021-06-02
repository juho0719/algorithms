package com.juho.leetCode.challenge.month05.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrefixAndSuffixSearchTest {

    @Test
    public void prefixAndSuffixSearch01Test() {
        String[] words01 = {"apple"};
        PrefixAndSuffixSearch pss = new PrefixAndSuffixSearch(words01);
        assertEquals(0, pss.f("a", "e"));
    }

}
