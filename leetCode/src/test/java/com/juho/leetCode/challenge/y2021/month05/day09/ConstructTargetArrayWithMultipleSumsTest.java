package com.juho.leetCode.challenge.y2021.month05.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConstructTargetArrayWithMultipleSumsTest {

    ConstructTargetArrayWithMultipleSums ctams = new ConstructTargetArrayWithMultipleSums();

    @Test
    public void constructTargetArrayWithMultipleSums01Test() {
        int[] target01 = {9,3,5};
        assertEquals(true, ctams.isPossible(target01));

        int[] target02 = {1,1,1,2};
        assertEquals(false, ctams.isPossible(target02));

        int[] target03 = {8,5};
        assertEquals(true, ctams.isPossible(target03));
    }

}
