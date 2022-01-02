package com.juho.leetCode.challenge.y2021.month12.day26;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class KClosestPointsToOriginTest {

    KClosestPointsToOrigin kcpo = new KClosestPointsToOrigin();

    @Test
    public void kClosestPointsToOrigin01Test() {
        int[][] points01 = {{1,3},{-2,2}};
        int k01 = 1;
        int[][] result01 = {{-2,2}};
        assertArrayEquals(result01, kcpo.kClosest(points01, k01));

        int[][] points02 = {{3,3},{5,-1},{-2,4}};
        int k02 = 2;
        int[][] result02 = {{3,3},{-2,4}};
        assertArrayEquals(result02, kcpo.kClosest(points02, k02));
    }
}