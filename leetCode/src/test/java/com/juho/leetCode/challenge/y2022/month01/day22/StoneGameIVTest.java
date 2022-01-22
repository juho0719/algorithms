package com.juho.leetCode.challenge.y2022.month01.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StoneGameIVTest {
    
    StoneGameIV sg4 = new StoneGameIV();

    @Test
    public void stoneGameIV01Test() {
        int n01 = 1;
        assertEquals(true, sg4.winnerSquareGame(n01));

        int n02 = 2;
        assertEquals(false, sg4.winnerSquareGame(n02));
    }
}