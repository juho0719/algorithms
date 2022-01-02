package com.juho.leetCode.challenge.y2021.month09.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShortestPathInaGridWithObstaclesEliminationTest {

    ShortestPathInaGridWithObstaclesElimination spoe = new ShortestPathInaGridWithObstaclesElimination();

    @Test
    public void shortestPathInaGridWithObstaclesElimination01Test() {
        int[][] grid01 = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
        int k01 = 1;
        assertEquals(6, spoe.shortestPath(grid01, k01));

        int[][] grid02 = {{0,1,1},{1,1,1},{1,0,0}};
        int k02 = 1;
        assertEquals(-1, spoe.shortestPath(grid02, k02));
    }
}