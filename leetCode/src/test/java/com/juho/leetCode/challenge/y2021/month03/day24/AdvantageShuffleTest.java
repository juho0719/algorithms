package com.juho.leetCode.challenge.y2021.month03.day24;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class AdvantageShuffleTest {
    
    AdvantageShuffle as = new AdvantageShuffle();

    @Test
    public void advantageShuffle01Test() {
        int[] A01 = {2,7,11,15};
        int[] B01 = {1,10,4,11};
        int[] result01 = {2,11,7,15};
        assertArrayEquals(result01, as.advantageCount(A01, B01));

        int[] A02 = {12,24,8,32};
        int[] B02 = {13,25,32,11};
        int[] result02 = {24,32,8,12};
        assertArrayEquals(result02, as.advantageCount(A02, B02));
    }
}
