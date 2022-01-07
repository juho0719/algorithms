package com.juho.leetCode.challenge.y2022.month01.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarPoolingTest {

    CarPooling cp = new CarPooling();
    
    @Test
    public void carPooling01Test() {
        int[][] trips01 = {{2,1,5},{3,3,7}};
        int capacity01 = 4;
        assertEquals(false, cp.carPooling(trips01, capacity01));

        int[][] trips02 = {{2,1,5},{3,3,7}};
        int capacity02 = 5;
        assertEquals(true, cp.carPooling(trips02, capacity02));
    }
}