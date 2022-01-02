package com.juho.leetCode.challenge.y2021.month08.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PatchingArrayTest {

    PatchingArray pa = new PatchingArray();

    @Test
    public void patchingArray01Test() {
        int[] nums01 = {1,3};
        int n01 = 6;
        assertEquals(1, pa.minPatches(nums01, n01));

        int[] nums02 = {1,5,10};
        int n02 = 20;
        assertEquals(2, pa.minPatches(nums02, n02));

        int[] nums03 = {1,2,2};
        int n03 = 5;
        assertEquals(0, pa.minPatches(nums03, n03));
    }
}