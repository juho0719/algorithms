package com.juho.leetCode.challenge.y2022.month04.day09;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {

    TopKFrequentElements tfe = new TopKFrequentElements();

    @Test
    public void topKFrequentElements01Test() {
        int[] nums01 = {1,1,1,2,2,3};
        int k01 = 2;
        int[] realResult01 = tfe.topKFrequent(nums01, k01);
        Arrays.sort(realResult01);
        int[] result01 = {1,2};
        assertArrayEquals(result01, result01);
    }
}