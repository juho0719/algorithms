package com.juho.leetCode.challenge.y2022.month04.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NextPermutationTest {

    NextPermutation np = new NextPermutation();

    @Test
    public void nextPermutationII01Test() {
        int[] nums01 = {1,2,3};
        int[] result01 = {1,3,2};
        np.nextPermutation(nums01);
        assertArrayEquals(result01, nums01);
    }
}