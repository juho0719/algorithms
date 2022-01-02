package com.juho.leetCode.challenge.y2021.month05.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NonDecreasingArrayTest {

    NonDecreasingArray nda = new NonDecreasingArray();

    @Test
    public void nonDecreasingArray01Test() {
        int[] nums01 = {4,2,3};
        assertEquals(true, nda.checkPossibility(nums01));

        int[] nums02 = {4,2,1};
        assertEquals(false, nda.checkPossibility(nums02));

        int[] nums03 = {-1,4,2,3};
        assertEquals(true, nda.checkPossibility(nums03));
    }

}
