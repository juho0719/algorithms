package com.juho.leetCode.challenge.month06.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumUnitsOnaTruckTest {

    MaximumUnitsOnaTruck mut = new MaximumUnitsOnaTruck();

    @Test
    public void maximumUnitsOnaTruck01Test() {
        int[][] boxTypes01 = {{1,3}, {2,2}, {3,1}};
        int truckSize01 = 4;
        assertEquals(8, mut.maximumUnits(boxTypes01, truckSize01));

        int[][] boxTypes02 = {{5,10}, {2,5}, {4,7}, {3,9}};
        int truckSize02 = 10;
        assertEquals(91, mut.maximumUnits(boxTypes02, truckSize02));
    }

}
