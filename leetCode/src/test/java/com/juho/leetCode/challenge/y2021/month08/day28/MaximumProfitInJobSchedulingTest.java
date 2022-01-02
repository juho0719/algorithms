package com.juho.leetCode.challenge.y2021.month08.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumProfitInJobSchedulingTest {

    MaximumProfitInJobScheduling mpjs = new MaximumProfitInJobScheduling();

    @Test
    public void maximumProfitInJobScheduling01Test() {
        int[] startTime01 = {1,2,3,3};
        int[] endTime01 = {3,4,5,6};
        int[] profit01 = {50,10,40,70};
        assertEquals(120, mpjs.jobScheduling(startTime01, endTime01, profit01));

        int[] startTime02 = {1,2,3,4,6};
        int[] endTime02 = {3,5,10,6,9};
        int[] profit02 = {20,20,100,70,60};
        assertEquals(150, mpjs.jobScheduling(startTime02, endTime02, profit02));

        int[] startTime03 = {1,1,1};
        int[] endTime03 = {2,3,4};
        int[] profit03 = {5,6,4};
        assertEquals(6, mpjs.jobScheduling(startTime03, endTime03, profit03));
    }
}