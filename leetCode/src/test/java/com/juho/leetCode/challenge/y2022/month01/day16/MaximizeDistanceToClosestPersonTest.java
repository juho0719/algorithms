package com.juho.leetCode.challenge.y2022.month01.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximizeDistanceToClosestPersonTest {
    
    MaximizeDistanceToClosestPerson mdcp = new MaximizeDistanceToClosestPerson();

    @Test
    public void maximizeDistanceToClosestPerson01Test() {
        int[] seats01 = {1,0,0,0};
        assertEquals(3, mdcp.maxDistToClosest(seats01));

        int[] seats02 = {0,1};
        assertEquals(1, mdcp.maxDistToClosest(seats02));
        
    }
}