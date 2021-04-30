package com.juho.leetCode.aprilLeetCodingChallenge.day29;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    FindFirstAndLastPositionOfElementInSortedArray fflpesa = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void findFirstAndLastPositionOfElementInSortedArray01Test() {
        int[] nums01 = {5,7,7,8,8,10};
        int target01 = 8;
        int[] result01 = {3,4};
        assertArrayEquals(result01, fflpesa.searchRange(nums01, target01));

        int[] nums02 = {5,7,7,8,8,10};
        int target02 = 6;
        int[] result02 = {-1,-1};
        assertArrayEquals(result02, fflpesa.searchRange(nums02, target02));

        int[] nums03 = {};
        int target03 = 0;
        int[] result03 = {-1,-1};
        assertArrayEquals(result03, fflpesa.searchRange(nums03, target03));
    }

}
