package com.juho.leetCode.challenge.month10.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DungeonGameTest {

    DungeonGame dg = new DungeonGame();

    @Test
    public void dungeonGame01Test() {
        int[][] dungeon01 = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        assertEquals(7, dg.calculateMinimumHP(dungeon01));

        int[][] dungeon02 = {{0}};
        assertEquals(1, dg.calculateMinimumHP(dungeon02));
    }
}