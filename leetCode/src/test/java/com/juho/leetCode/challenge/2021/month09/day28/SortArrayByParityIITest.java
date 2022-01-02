package com.juho.leetCode.challenge.month09.day28;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortArrayByParityIITest {

    SortArrayByParityII sap2 = new SortArrayByParityII();

    @Test
    public void sortArrayByParityII01Test() {
        int[] nums01 = {4,2,5,7};
        int[] result01 = {4,5,2,7};
        assertArrayEquals(result01, sap2.sortArrayByParityII(nums01));

        int[] nums02 = {2,3};
        int[] result02 = {2,3};
        assertArrayEquals(result02, sap2.sortArrayByParityII(nums02));
    }
}