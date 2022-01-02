package com.juho.leetCode.challenge.y2021.month07.day17;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ThreeEqualPartsTest {

    ThreeEqualParts tep = new ThreeEqualParts();

    @Test
    public void threeEqualParts01Test() {
        int[] arr01 = {1,0,1,0,1};
        int[] result01 = {0,3};
        assertArrayEquals(result01, tep.threeEqualParts(arr01));

        int[] arr02 = {1,1,0,1,1};
        int[] result02 = {-1,-1};
        assertArrayEquals(result02, tep.threeEqualParts(arr02));

        int[] arr03 = {1,1,0,0,1};
        int[] result03 = {0,2};
        assertArrayEquals(result03, tep.threeEqualParts(arr03));
    }

}
