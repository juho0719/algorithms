package com.juho.leetCode.challenge.y2021.month01.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {

    BoatsToSavePeople btsp = new BoatsToSavePeople();

    @Test
    public void boatsToSavePeople01Test() {
        int[] people01 = {1,2};
        int limit01 = 3;
        assertEquals(btsp.numRescueBoats(people01, limit01), 1);

        int[] people02 = {3,2,2,1};
        int limit02 = 3;
        assertEquals(btsp.numRescueBoats(people02, limit02), 3);

        int[] people03 = {3,5,3,4};
        int limit03 = 5;
        assertEquals(btsp.numRescueBoats(people03, limit03), 4);
    }
}