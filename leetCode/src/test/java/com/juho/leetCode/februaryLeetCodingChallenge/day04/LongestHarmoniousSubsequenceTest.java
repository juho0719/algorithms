package com.juho.leetCode.februaryLeetCodingChallenge.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestHarmoniousSubsequenceTest {
    
    LongestHarmoniousSubsequence lhs = new LongestHarmoniousSubsequence();

    @Test
    public void longestHarmoniousSubsequence01Test() {
        int[] nums01 = {1,3,2,2,5,2,3,7};
        assertEquals(lhs.findLHS(nums01), 5);

        int[] nums02 = {1,2,3,4};
        assertEquals(lhs.findLHS(nums02), 2);

        int[] nums03 = {1,1,1,1};
        assertEquals(lhs.findLHS(nums03), 0);
    }
}
