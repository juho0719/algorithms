package com.juho.leetCode.marchLeetCodingChallenge.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SetMismatchTest {
    
    SetMismatch sm = new SetMismatch();

    @Test
    public void setMismatch01Test() {
        int[] nums01 = {1,2,2,4};
        int[] result01 = {2,3};
        assertArrayEquals(sm.findErrorNums(nums01), result01);

        int[] nums02 = {1,1};
        int[] result02 = {1,2};
        assertArrayEquals(sm.findErrorNums(nums02), result02);

        int[] nums03 = {2,2};
        int[] result03 = {2,1};
        assertArrayEquals(sm.findErrorNums(nums03), result03);

        int[] nums04 = {3,2,2};
        int[] result04 = {2,1};
        assertArrayEquals(sm.findErrorNums(nums04), result04);

        int[] nums05 = {3,2,3,4,6,5};
        int[] result05 = {3,1};
        assertArrayEquals(sm.findErrorNums(nums05), result05);
    }
}
