package com.juho.leetCode.jenuaryLeetCodingChallenge.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.jenuaryLeetCodingChallenge.day15.GetMaximumInGeneratedArray;

import org.junit.jupiter.api.Test;

public class GetMaximumInGeneratedArrayTest {

    GetMaximumInGeneratedArray gmiga = new GetMaximumInGeneratedArray();

    @Test
    public void minimumOperationsToReduceXtoZero01Test() {
        assertEquals(gmiga.getMaximumGenerated(7), 3);
        assertEquals(gmiga.getMaximumGenerated(2), 1);
        assertEquals(gmiga.getMaximumGenerated(3), 2);
    }
}