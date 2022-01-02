package com.juho.leetCode.challenge.y2021.month06.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KInversePairsArrayTest {

    KInversePairsArray kipa = new KInversePairsArray();

    @Test
    public void kInversePairsArray01Test() {
        int n01 = 3;
        int k01 = 0;
        assertEquals(1, kipa.kInversePairs(n01, k01));

        int n02 = 3;
        int k02 = 1;
        assertEquals(2, kipa.kInversePairs(n02, k02));
    }

}
