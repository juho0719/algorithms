package com.juho.leetCode.challenge.y2022.month02.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveCoveredIntervalsTest {

    RemoveCoveredIntervals mda = new RemoveCoveredIntervals();

    @Test
    public void removeCoveredIntervals01Test() {
        int[][] intervals01 = {{1,4},{3,6},{2,8}};
        assertEquals(2, mda.removeCoveredIntervals(intervals01));
    }
}