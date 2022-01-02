package com.juho.leetCode.challenge.month11.day24;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class IntervalistIntersectionsTest {

    IntervalistIntersections ii = new IntervalistIntersections();

    @Test
    public void intervalistIntersections01Test() {
        int[][] firstList01 = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList01 = {{1,5},{8,12},{15,24},{25,26}};
        int[][] result01 = {{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};
        assertArrayEquals(result01, ii.intervalIntersection(firstList01, secondList01));

        int[][] firstList02 = {{1,3},{5,9}};
        int[][] secondList02 = {};
        int[][] result02 = {};
        assertArrayEquals(result02, ii.intervalIntersection(firstList02, secondList02));

        int[][] firstList03 = {};
        int[][] secondList03 = {{4,8},{10,12}};
        int[][] result03 = {};
        assertArrayEquals(result03, ii.intervalIntersection(firstList03, secondList03));

        int[][] firstList04 = {{1,7}};
        int[][] secondList04 = {{3,10}};
        int[][] result04 = {{3,7}};
        assertArrayEquals(result04, ii.intervalIntersection(firstList04, secondList04));
    }
}