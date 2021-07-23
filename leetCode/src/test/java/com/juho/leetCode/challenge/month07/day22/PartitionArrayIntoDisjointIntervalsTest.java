package com.juho.leetCode.challenge.month07.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PartitionArrayIntoDisjointIntervalsTest {

    PartitionArrayIntoDisjointIntervals padi = new PartitionArrayIntoDisjointIntervals();

    @Test
    public void partitionArrayIntoDisjointIntervals01Test() {
        int[] nums01 = {5,0,3,8,6};
        assertEquals(3, padi.partitionDisjoint(nums01));

        int[] nums02 = {1,1,1,0,6,12};
        assertEquals(4, padi.partitionDisjoint(nums02));
    }

}
