package com.juho.leetCode.challenge.y2021.month06.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberOfSubarraysWithBoundedMaximumTest {

    NumberOfSubarraysWithBoundedMaximum nsbm = new NumberOfSubarraysWithBoundedMaximum();

    @Test
    public void numberOfSubarraysWithBoundedMaximum01Test() {
        int[] nums01 = {2,1,4,3};
        int left01 = 2;
        int right01 = 3;
        assertEquals(3, nsbm.numSubarrayBoundedMax(nums01, left01, right01));
    }

}
