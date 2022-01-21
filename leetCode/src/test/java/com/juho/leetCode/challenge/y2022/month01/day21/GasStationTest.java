package com.juho.leetCode.challenge.y2022.month01.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GasStationTest {
    
    GasStation gs = new GasStation();

    @Test
    public void gasStation01Test() {
        int[] gas01 = {1,2,3,4,5};
        int[] cost01 = {3,4,5,1,2};
        assertEquals(3, gs.canCompleteCircuit(gas01, cost01));

        int[] gas02 = {2,3,4};
        int[] cost02 = {3,4,3};
        assertEquals(-1, gs.canCompleteCircuit(gas02, cost02));
    }
}