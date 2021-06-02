package com.juho.leetCode.challenge.month04.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CombinationSumIVTest {

    CombinationSumIV cs4 = new CombinationSumIV();

    @Test
    public void combinationSumIV01Test() {
        int[] nums01 = {1,2,3};
        assertEquals(7, cs4.combinationSum4(nums01, 4));

        int[] nums02 = {9};
        assertEquals(0, cs4.combinationSum4(nums02, 3));
    }
}
