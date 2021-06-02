package com.juho.leetCode.challenge.month03.day31;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class StampingTheSequenceTest {
    
    StampingTheSequence sts = new StampingTheSequence();

    @Test
    public void stampingTheSequence01Test() {
        String stamp01 = "abc";
        String target01 = "ababc";
        int[] result01 = {1,0,2};
        assertArrayEquals(result01, sts.movesToStamp(stamp01, target01));

        String stamp02 = "abca";
        String target02 = "aabcaca";
        int[] result02 = {2,3,0,1};
        assertArrayEquals(result02, sts.movesToStamp(stamp02, target02));
    }
}
