package com.juho.leetCode.challenge.y2021.month12.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PartitionEqualSubsetSumTest {

    PartitionEqualSubsetSum pes = new PartitionEqualSubsetSum();

    @Test
    public void partitionEqualSubsetSum01Test() {
        int[] nums01 = {1,5,11,5};
        assertEquals(true, pes.canPartition(nums01));

        int[] nums02 = {1,2,3,5};
        assertEquals(false, pes.canPartition(nums02));
    }
}