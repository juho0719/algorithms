package com.juho.leetCode.challenge.y2021.month06.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MatchsticksToSquareTest {

    MatchsticksToSquare ms = new MatchsticksToSquare();

    @Test
    public void matchsticksToSquare01Test() {
        int[] matchsticks01 = {1,1,2,2,2};
        assertEquals(true, ms.makesquare(matchsticks01));

        int[] matchsticks02 = {3,3,3,3,4};
        assertEquals(false, ms.makesquare(matchsticks02));
    }

}
