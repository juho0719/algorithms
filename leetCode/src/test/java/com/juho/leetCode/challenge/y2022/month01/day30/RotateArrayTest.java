package com.juho.leetCode.challenge.y2022.month01.day30;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    RotateArray ra = new RotateArray();

    @Test
    public void rotateArray01Test() {
        int[] nums01 = {1,2,3,4,5,6,7};
        int k01 = 3;
        ra.rotate(nums01, k01);
        int[] result01 = {5,6,7,1,2,3,4};
        assertArrayEquals(result01, nums01);
    }
}