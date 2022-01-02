package com.juho.leetCode.challenge.y2021.month07.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReduceArraySizeToTheHalfTest {

    ReduceArraySizeToTheHalf rash = new ReduceArraySizeToTheHalf();

    @Test
    public void reduceArraySizeToTheHalf01Test() {
        int[] arr01 = {3,3,3,3,5,5,5,2,2,7};
        assertEquals(2, rash.minSetSize(arr01));

        int[] arr02 = {7,7,7,7,7,7};
        assertEquals(1, rash.minSetSize(arr02));

        int[] arr03 = {1,9};
        assertEquals(1, rash.minSetSize(arr03));

        int[] arr04 = {1000,1000,3,7};
        assertEquals(1, rash.minSetSize(arr04));

        int[] arr05 = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(5, rash.minSetSize(arr05));
    }

}
