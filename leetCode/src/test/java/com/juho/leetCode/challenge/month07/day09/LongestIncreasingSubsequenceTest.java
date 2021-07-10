package com.juho.leetCode.challenge.month07.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

    @Test
    public void longestIncreasingSubsequence01Test() {
        int[] nums01 = {10,9,2,5,3,7,101,18};
        assertEquals(4, lis.lengthOfLIS(nums01));

        int[] nums02 = {0,1,0,3,2,3};
        assertEquals(4, lis.lengthOfLIS(nums02));
    }

}
