package com.juho.leetCode.challenge.month09.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SplitLinkedListInPartsTest {

    PartitionToKEqualSumSubsets pkess = new PartitionToKEqualSumSubsets();

    @Test
    public void partitionToKEqualSumSubsets01Test() {
        int[] nums01 = {4,3,2,3,5,2,1};
        int k01 = 4;
        assertEquals(true, pkess.canPartitionKSubsets(nums01, k01));
        
        int[] nums02 = {1,2,3,4};
        int k02 = 3;
        assertEquals(false, pkess.canPartitionKSubsets(nums02, k02));
    }
}