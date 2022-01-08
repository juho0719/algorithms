package com.juho.leetCode.challenge.y2022.month01.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CherryPickupIITest {

    CherryPickupII cp2 = new CherryPickupII();

    @Test
    public void cherryPickupII01Test() {
        int[][] grid01 = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        assertEquals(24, cp2.cherryPickup(grid01));

        int[][] grid02 = {{1,0,0,0,0,0,1},{2,0,0,0,0,3,0},{2,0,9,0,0,0,0},{0,3,0,5,4,0,0},{1,0,2,3,0,0,6}};
        assertEquals(28, cp2.cherryPickup(grid02));
    }
}