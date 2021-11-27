package com.juho.leetCode.challenge.month11.day27;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf paes = new ProductOfArrayExceptSelf();

    @Test
    public void productOfArrayExceptSelf01Test() {
        int[] nums01 = {1,2,3,4};
        int[] result01 = {24,12,8,6};
        assertArrayEquals(result01, paes.productExceptSelf(nums01));

        int[] nums02 = {-1,1,0,-3,3};
        int[] result02 = {0,0,9,0,0};
        assertArrayEquals(result02, paes.productExceptSelf(nums02));
    }
}