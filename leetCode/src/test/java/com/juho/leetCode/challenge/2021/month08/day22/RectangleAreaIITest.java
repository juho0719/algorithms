package com.juho.leetCode.challenge.month08.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleAreaIITest {

    RectangleAreaII ra2 = new RectangleAreaII();

    @Test
    public void rectangleAreaII01Test() {
        int[][] rectangles01 = {{0,0,2,2},{1,0,2,3},{1,0,3,1}};
        assertEquals(6, ra2.rectangleArea(rectangles01));

        int[][] rectangles02 = {{0,0,1000000000,1000000000}};
        assertEquals(49, ra2.rectangleArea(rectangles02));
    }
}
