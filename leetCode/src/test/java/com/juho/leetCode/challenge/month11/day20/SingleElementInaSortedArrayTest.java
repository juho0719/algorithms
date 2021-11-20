package com.juho.leetCode.challenge.month11.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingleElementInaSortedArrayTest {

    SingleElementInaSortedArray sesa = new SingleElementInaSortedArray();

    @Test
    public void singleElementInaSortedArray01Test() {
        int[] nums01 = {1,1,2,3,3,4,4,8,8};
        assertEquals(2, sesa.singleNonDuplicate(nums01));

        int[] nums02 = {3,3,7,7,10,11,11};
        assertEquals(10, sesa.singleNonDuplicate(nums02));
    }
}