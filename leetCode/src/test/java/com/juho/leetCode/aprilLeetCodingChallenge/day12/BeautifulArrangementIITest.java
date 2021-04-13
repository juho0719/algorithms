package com.juho.leetCode.aprilLeetCodingChallenge.day12;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BeautifulArrangementIITest {

    BeautifulArrangementII ba2 = new BeautifulArrangementII();

    @Test
    public void deepestLeavesSum01Test() {
        int n01 = 3;
        int k01 = 1;
        int[] result01 = {1,2,3};
        assertArrayEquals(result01, ba2.constructArray(n01, k01));

        int n02 = 3;
        int k02 = 2;
        int[] result02 = {1,3,2};
        assertArrayEquals(result02, ba2.constructArray(n02, k02));
    }
}
