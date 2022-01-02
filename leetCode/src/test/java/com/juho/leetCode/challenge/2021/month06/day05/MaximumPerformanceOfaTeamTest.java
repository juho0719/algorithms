package com.juho.leetCode.challenge.month06.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumPerformanceOfaTeamTest {

    MaximumPerformanceOfaTeam mpt = new MaximumPerformanceOfaTeam();

    @Test
    public void maximumPerformanceOfaTeam01Test() {
        int n01 = 6;
        int[] speed01 = {2,10,3,1,5,8};
        int[] efficiency01 = {5,4,3,9,7,2};
        int k01 = 2;
        assertEquals(60, mpt.maxPerformance(n01, speed01, efficiency01, k01));

        int n02 = 6;
        int[] speed02 = {2,10,3,1,5,8};
        int[] efficiency02 = {5,4,3,9,7,2};
        int k02 = 3;
        assertEquals(68, mpt.maxPerformance(n02, speed02, efficiency02, k02));

        int n03 = 6;
        int[] speed03 = {2,10,3,1,5,8};
        int[] efficiency03 = {5,4,3,9,7,2};
        int k03 = 4;
        assertEquals(72, mpt.maxPerformance(n03, speed03, efficiency03, k03));
    }

}
