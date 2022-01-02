package com.juho.leetCode.challenge.y2021.month01.day31;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NextPermutationTest {

    NextPermutation np = new NextPermutation();

    @Test
    public void nextPermutation01Test() {
        int[] nums01 = {1,2,3};
        np.nextPermutation(nums01);
        int[] result01 = {1,3,2};
        assertArrayEquals(nums01, result01);

        int[] nums02 = {3,2,1};
        np.nextPermutation(nums02);
        int[] result02 = {1,2,3};
        assertArrayEquals(nums02, result02);

        int[] nums03 = {1,1,5};
        np.nextPermutation(nums03);
        int[] result03 = {1,5,1};
        assertArrayEquals(nums03, result03);

        int[] nums04 = {1};
        np.nextPermutation(nums04);
        int[] result04 = {1};
        assertArrayEquals(nums04, result04);

        int[] nums05 = {1,3,2};
        np.nextPermutation(nums05);
        int[] result05 = {2,1,3};
        assertArrayEquals(nums05, result05);
    }
}