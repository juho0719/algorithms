package com.juho.leetCode.challenge.month06.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

    @Test
    public void longestConsecutiveSequence01Test() {
        int[] nums01 = {100,4,200,1,3,2};
        assertEquals(4, lcs.longestConsecutive(nums01));

        int[] nums02 = {0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, lcs.longestConsecutive(nums02));
    }

}
