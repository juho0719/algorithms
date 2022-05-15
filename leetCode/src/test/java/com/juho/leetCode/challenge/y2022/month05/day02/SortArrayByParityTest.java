package com.juho.leetCode.challenge.y2022.month05.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {

    SortArrayByParity sap = new SortArrayByParity();

    @Test
    public void sortArrayByParity01Test() {
        int[] nums01 = {3,1,2,4};
        int[] result01 = {2,4,3,1};
        assertArrayEquals(result01, sap.sortArrayByParity(nums01));
    }
}