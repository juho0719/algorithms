package com.juho.leetCode.challenge.y2022.month02.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KdiffPairsInAnArrayTest {

    KdiffPairsInAnArray kdpa = new KdiffPairsInAnArray();

    @Test
    public void kdiffPairsInAnArray01Test() {
        int[] nums01 = {3,1,4,1,5};
        int k01 = 2;
        assertEquals(2, kdpa.findPairs(nums01, k01));

        int[] nums02 = {1,2,3,4,5};
        int k02 = 1;
        assertEquals(4, kdpa.findPairs(nums02, k02));

        int[] nums03 = {1,3,1,5,4};
        int k03 = 0;
        assertEquals(1, kdpa.findPairs(nums03, k03));
    }
}