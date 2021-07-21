package com.juho.leetCode.challenge.month07.day20;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ShuffleAnArrayTest {

    @Test
    public void shuffleAnArray01Test() {
        int[] nums = {1,2,3};
        ShuffleAnArray sa = new ShuffleAnArray(nums);

        int[] param01 = sa.reset();
        assertArrayEquals(nums, param01);
    }

}
