package com.juho.leetCode.challenge.month12.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumCostToMoveChipsToTheSamePositionTest {

    MinimumCostToMoveChipsToTheSamePosition mcsp = new MinimumCostToMoveChipsToTheSamePosition();

    @Test
    public void minimumCostToMoveChipsToTheSamePosition01Test() {
        int[] position01 = {1,2,3};
        assertEquals(1, mcsp.minCostToMoveChips(position01));

        int[] position02 = {2,2,2,3,3};
        assertEquals(2, mcsp.minCostToMoveChips(position02));

        int[] position03 = {1,1000000000};
        assertEquals(1, mcsp.minCostToMoveChips(position03));
    }
}