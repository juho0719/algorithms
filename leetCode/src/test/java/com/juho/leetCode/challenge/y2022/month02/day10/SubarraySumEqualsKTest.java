package com.juho.leetCode.challenge.y2022.month02.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubarraySumEqualsKTest {

    SubarraySumEqualsK sse = new SubarraySumEqualsK();

    @Test
    public void subarraySumEqualsK01Test() {
        int[] nums01 = {1,1,1};
        int k01 = 2;
        assertEquals(2, sse.subarraySum(nums01, k01));

        int[] nums02 = {1,2,3};
        int k02 = 3;
        assertEquals(2, sse.subarraySum(nums02, k02));
    }
}