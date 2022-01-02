package com.juho.leetCode.challenge.month06.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfRefuelingStopsTest {

    MinimumNumberOfRefuelingStops mnrs = new MinimumNumberOfRefuelingStops();

    @Test
    public void minimumNumberOfRefuelingStops01Test() {
        int target01 = 1;
        int startFuel01 = 1;
        int[][] stations01 = {};
        assertEquals(0, mnrs.minRefuelStops(target01, startFuel01, stations01));
        
        int target02 = 100;
        int startFuel02 = 1;
        int[][] stations02 = {{10,100}};
        assertEquals(-1, mnrs.minRefuelStops(target02, startFuel02, stations02));

        int target03 = 100;
        int startFuel03 = 10;
        int[][] stations03 = {{10,60}, {20,30}, {30,30}, {60,40}};
        assertEquals(2, mnrs.minRefuelStops(target03, startFuel03, stations03));
    }

}
