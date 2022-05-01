package com.juho.leetCode.challenge.y2022.month04.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinCostToConnectAllPointsTest {

    MinCostToConnectAllPoints mcap = new MinCostToConnectAllPoints();

    @Test
    public void minCostToConnectAllPoints01Test() {
        int[][] points01 = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        assertEquals(20, mcap.minCostConnectPoints(points01));
    }
}