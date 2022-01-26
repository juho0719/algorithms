package com.juho.leetCode.challenge.y2022.month01.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {
    
    ValidMountainArray vma = new ValidMountainArray();

    @Test
    public void validMountainArray01Test() {
        int[] arr01 = {2,1};
        assertEquals(false, vma.validMountainArray(arr01));

        int[] arr02 = {3,5,5};
        assertEquals(false, vma.validMountainArray(arr02));

        int[] arr03 = {0,3,2,1};
        assertEquals(true, vma.validMountainArray(arr03));

    }
}