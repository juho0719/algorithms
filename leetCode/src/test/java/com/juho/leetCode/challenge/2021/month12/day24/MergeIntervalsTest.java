package com.juho.leetCode.challenge.month12.day24;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    MergeIntervals mi = new MergeIntervals();

    @Test
    public void mergeIntervals01Test() {
        int[][] intervals01 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result01 = {{1,6},{8,10},{15,18}};
        assertArrayEquals(result01, mi.merge(intervals01));

        int[][] intervals02 = {{1,4},{4,5}};
        int[][] result02 = {{1,5}};
        assertArrayEquals(result02, mi.merge(intervals02));
    }
}