package com.juho.leetCode.challenge.month07.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {

    FindPeakElement fpe = new FindPeakElement();

    @Test
    public void findPeakElement01Test() {
        int[] nums01 = {1,2,3,1};
        assertEquals(2, fpe.findPeakElement(nums01));

        int[] nums02 = {1,2,1,3,5,6,4};
        assertEquals(5, fpe.findPeakElement(nums02));
    }

}
