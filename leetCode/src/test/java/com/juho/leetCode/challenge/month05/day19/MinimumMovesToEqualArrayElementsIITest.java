package com.juho.leetCode.challenge.month05.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumMovesToEqualArrayElementsIITest {

    MinimumMovesToEqualArrayElementsII mmeae = new MinimumMovesToEqualArrayElementsII();
    
    @Test
    public void minimumMovesToEqualArrayElementsII01Test() {
        int[] nums01 = {1,2,3};
        assertEquals(2, mmeae.minMoves2(nums01));

        int[] nums02 = {1,10,2,9};
        assertEquals(16, mmeae.minMoves2(nums02));
    }
}