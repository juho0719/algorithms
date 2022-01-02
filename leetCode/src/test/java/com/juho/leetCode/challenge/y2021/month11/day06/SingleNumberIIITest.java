package com.juho.leetCode.challenge.y2021.month11.day06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SingleNumberIIITest {

    SingleNumberIII sn3 = new SingleNumberIII();

    @Test
    public void singleNumberIII01Test() {
        int[] nums01 = {1,2,1,3,2,5};
        int[] result01 = {3,5};
        assertArrayEquals(result01, sn3.singleNumber(nums01));

        int[] nums02 = {-1,0};
        int[] result02 = {-1,0};
        assertArrayEquals(result02, sn3.singleNumber(nums02));
    }
}