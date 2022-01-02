package com.juho.leetCode.challenge.y2021.month10.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IslandPerimeterTest {

    IslandPerimeter ip = new IslandPerimeter();

    @Test
    public void islandPerimeter01Test() {
        int[][] grid01 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        assertEquals(16, ip.islandPerimeter(grid01));

        int[][] grid02 = {{1,0}};
        assertEquals(4, ip.islandPerimeter(grid02));
    }
}