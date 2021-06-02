package com.juho.leetCode.challenge.month02.day16;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LetterCasePermutationTest {
    
    LetterCasePermutation lcp = new LetterCasePermutation();

    @Test
    public void letterCasePermutation01Test() {
        String S01 = "a1b2";
        List<String> result01 = lcp.letterCasePermutation(S01);
        Collections.sort(result01);

        List<String> expectedResult01 = new ArrayList<>();
        expectedResult01.add("a1b2");
        expectedResult01.add("a1B2");
        expectedResult01.add("A1b2");
        expectedResult01.add("A1B2");
        Collections.sort(expectedResult01);

        assertArrayEquals(result01.toArray(), expectedResult01.toArray());
    }
}
