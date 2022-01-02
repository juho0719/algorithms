package com.juho.leetCode.challenge.y2021.month11.day13;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {

    DailyTemperatures dt = new DailyTemperatures();

    @Test
    public void dailyTemperatures01Test() {
        int[] temperatures01 = {73,74,75,71,69,72,76,73};
        int[] result01 = {1,1,4,2,1,1,0,0};
        assertArrayEquals(result01, dt.dailyTemperatures(temperatures01));
        
        int[] temperatures02 = {30,40,50,60};
        int[] result02 = {1,1,1,0};
        assertArrayEquals(result02, dt.dailyTemperatures(temperatures02));

        int[] temperatures03 = {30,60,90};
        int[] result03 = {1,1,0};
        assertArrayEquals(result03, dt.dailyTemperatures(temperatures03));
    }
}