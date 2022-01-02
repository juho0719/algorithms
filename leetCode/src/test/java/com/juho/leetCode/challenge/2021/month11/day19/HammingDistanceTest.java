package com.juho.leetCode.challenge.month11.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HammingDistanceTest {

    HammingDistance hd = new HammingDistance();

    @Test
    public void hammingDistance01Test() {
        int x01 = 4;
        int y01 = 1;
        assertEquals(2, hd.hammingDistance(x01, y01));

        int x02 = 3;
        int y02 = 1;
        assertEquals(1, hd.hammingDistance(x02, y02));
    }
}