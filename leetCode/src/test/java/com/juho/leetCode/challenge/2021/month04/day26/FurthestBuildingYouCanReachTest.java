package com.juho.leetCode.challenge.month04.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FurthestBuildingYouCanReachTest {

    FurthestBuildingYouCanReach fbycr = new FurthestBuildingYouCanReach();

    @Test
    public void furthestBuildingYouCanReach01Test() {
        int[] heights01 = {4,2,7,6,9,14,12};
        int bricks01 = 5;
        int ladders01 = 1;
        assertEquals(4, fbycr.furthestBuilding(heights01, bricks01, ladders01));

        int[] heights02 = {4,12,2,7,3,18,20,3,19};
        int bricks02 = 10;
        int ladders02 = 2;
        assertEquals(7, fbycr.furthestBuilding(heights02, bricks02, ladders02));

        int[] heights03 = {14,3,19,3};
        int bricks03 = 17;
        int ladders03 = 0;
        assertEquals(3, fbycr.furthestBuilding(heights03, bricks03, ladders03));
    }

}
