package com.juho.leetCode.challenge.y2022.month06.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

    RunningSumOf1dArray rs1a = new RunningSumOf1dArray();

    @Test
    public void runningSumOf1dArray01Test() {
        int[] nums01 = {1,2,3,4};
        int[] result01 = {1,3,6,10};
        assertArrayEquals(result01, rs1a.runningSum(nums01));
    }
}