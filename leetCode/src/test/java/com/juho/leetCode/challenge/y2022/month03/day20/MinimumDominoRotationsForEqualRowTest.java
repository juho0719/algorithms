package com.juho.leetCode.challenge.y2022.month03.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumDominoRotationsForEqualRowTest {

    MinimumDominoRotationsForEqualRow mdr = new MinimumDominoRotationsForEqualRow();

    @Test
    public void minimumDominoRotationsForEqualRow01Test() {
        int[] tops01 = {2,1,2,4,2,2};
        int[] bottoms01 = {5,2,6,2,3,2};
        assertEquals(2, mdr.minDominoRotations(tops01, bottoms01));
    }
}