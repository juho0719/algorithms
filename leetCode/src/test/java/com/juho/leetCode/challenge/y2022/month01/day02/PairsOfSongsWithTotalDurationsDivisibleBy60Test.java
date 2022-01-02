package com.juho.leetCode.challenge.y2022.month01.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    PairsOfSongsWithTotalDurationsDivisibleBy60 pstd60 = new PairsOfSongsWithTotalDurationsDivisibleBy60();
    
    @Test
    public void pairsOfSongsWithTotalDurationsDivisibleBy6001Test() {
        int[] nums01 = {30,20,150,100,40};
        assertEquals(3, pstd60.numPairsDivisibleBy60(nums01));

        int[] nums02 = {60,60,60};
        assertEquals(3, pstd60.numPairsDivisibleBy60(nums02));
    }
}