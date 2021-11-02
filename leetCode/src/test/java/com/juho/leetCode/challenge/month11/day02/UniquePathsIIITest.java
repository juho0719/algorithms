package com.juho.leetCode.challenge.month11.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniquePathsIIITest {

    UniquePathsIII up3 = new UniquePathsIII();

    @Test
    public void uniquePathsIII01Test() {
        int[][] grid01 = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        assertEquals(2, up3.uniquePathsIII(grid01));

        int[][] grid02 = {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
        assertEquals(4, up3.uniquePathsIII(grid02));

        int[][] grid03 = {{0,1},{2,0}};
        assertEquals(0, up3.uniquePathsIII(grid03));
    }
}