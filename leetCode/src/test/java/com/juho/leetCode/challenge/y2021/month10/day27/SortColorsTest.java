package com.juho.leetCode.challenge.y2021.month10.day27;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortColorsTest {

    SortColors sc = new SortColors();

    @Test
    public void sortColors01Test() {
        int[] nums01 = {2,0,2,1,1,0};
        int[] result01 = {0,0,1,1,2,2};
        sc.sortColors(nums01);
        assertArrayEquals(result01, nums01);

        int[] nums02 = {2,0,1};
        int[] result02 = {0,1,2};
        sc.sortColors(nums02);
        assertArrayEquals(result02, nums02);

        int[] nums03 = {0};
        int[] result03 = {0};
        sc.sortColors(nums03);
        assertArrayEquals(result03, nums03);

        int[] nums04 = {1};
        int[] result04 = {1};
        sc.sortColors(nums04);
        assertArrayEquals(result04, nums04);
    }
}