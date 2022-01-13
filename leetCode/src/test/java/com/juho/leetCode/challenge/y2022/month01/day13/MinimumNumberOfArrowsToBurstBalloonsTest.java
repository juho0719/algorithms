package com.juho.leetCode.challenge.y2022.month01.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfArrowsToBurstBalloonsTest {

    MinimumNumberOfArrowsToBurstBalloons mnabb = new MinimumNumberOfArrowsToBurstBalloons();

    @Test
    public void minimumNumberOfArrowsToBurstBalloons01Test() {
        int[][] points01 = {{10,16},{2,8},{1,6},{7,12}};
        assertEquals(2, mnabb.findMinArrowShots(points01));

        int[][] points02 = {{1,2},{3,4},{5,6},{7,8}};
        assertEquals(4, mnabb.findMinArrowShots(points02));
    }
}