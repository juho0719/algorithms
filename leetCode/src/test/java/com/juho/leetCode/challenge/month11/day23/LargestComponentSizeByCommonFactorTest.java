package com.juho.leetCode.challenge.month11.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargestComponentSizeByCommonFactorTest {

    LargestComponentSizeByCommonFactor lcscf = new LargestComponentSizeByCommonFactor();

    @Test
    public void largestComponentSizeByCommonFactor01Test() {
        int[] nums01 = {4,6,15,35};
        assertEquals(4, lcscf.largestComponentSize(nums01));

        int[] nums02 = {20,50,9,63};
        assertEquals(2, lcscf.largestComponentSize(nums02));

        int[] nums03 = {2,3,6,7,4,12,21,39};
        assertEquals(8, lcscf.largestComponentSize(nums03));
    }
}