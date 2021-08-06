package com.juho.leetCode.challenge.month08.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StoneGameTest {

    StoneGame sg = new StoneGame();

    @Test
    public void stoneGame01Test() {
        int[] piles01 = {5,3,4,5};
        assertEquals(true, sg.stoneGame(piles01));
    }
}
