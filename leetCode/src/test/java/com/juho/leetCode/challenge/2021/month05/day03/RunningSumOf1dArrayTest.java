package com.juho.leetCode.challenge.month05.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

    RunningSumOf1dArray rsa = new RunningSumOf1dArray();

    @Test
    public void runningSumOf1dArray01Test() {
        int[] nums01 = {1,2,3,4};
        int[] result01 = {1,3,6,10};
        assertArrayEquals(result01, rsa.runningSum(nums01));

        int[] nums02 = {1,1,1,1,1};
        int[] result02 = {1,2,3,4,5};
        assertArrayEquals(result02, rsa.runningSum(nums02));

        int[] nums03 = {3,1,2,10,1};
        int[] result03 = {3,4,6,16,17};
        assertArrayEquals(result03, rsa.runningSum(nums03));
    }

}
