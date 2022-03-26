package com.juho.leetCode.challenge.y2022.month03.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {

    BoatsToSavePeople bsp = new BoatsToSavePeople();

    @Test
    public void boatsToSavePeople01Test() {
        int[] people01 = {1,2};
        int limit01 = 3;
        assertEquals(1, bsp.numRescueBoats(people01, limit01));

        int[] people02 = {3,2,2,1};
        int limit02 = 3;
        assertEquals(3, bsp.numRescueBoats(people02, limit02));
    }
}