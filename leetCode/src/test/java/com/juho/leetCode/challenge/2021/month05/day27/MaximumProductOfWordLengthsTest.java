package com.juho.leetCode.challenge.month05.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumProductOfWordLengthsTest {
    
    MaximumProductOfWordLengths mpwl = new MaximumProductOfWordLengths();

    @Test
    public void maximumProductOfWordLengths01Test() {
        String[] words01 = {"abcw","baz","foo","bar","xtfn","abcdef"};
        assertEquals(16, mpwl.maxProduct(words01));

        String[] words02 = {"a","ab","abc","d","cd","bcd","abcd"};
        assertEquals(4, mpwl.maxProduct(words02));

        String[] words03 = {"a","aa","aaa","aaaa"};
        assertEquals(0, mpwl.maxProduct(words03));
    }
}