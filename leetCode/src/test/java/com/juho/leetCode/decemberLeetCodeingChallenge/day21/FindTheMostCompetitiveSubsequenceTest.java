package com.juho.leetCode.decemberLeetCodingChallenge.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindTheMostCompetitiveSubsequenceTest {

    FindTheMostCompetitiveSubsequence ftmcs = new FindTheMostCompetitiveSubsequence();

    @Test
    public void findTheMostCompetitiveSubsequence01Test() {
        int[] nums01 = {3,5,2,6};
        int k01 = 2;
        int[] result01 = {2,6};
        assertEquals(ftmcs.mostCompetitive(nums01, k01), result01);

        int[] nums02 = {2,4,3,3,5,4,9,6};
        int k02 = 4;
        int[] result02 = {2,3,3,4};
        assertEquals(ftmcs.mostCompetitive(nums02, k02), result02);
    }
}