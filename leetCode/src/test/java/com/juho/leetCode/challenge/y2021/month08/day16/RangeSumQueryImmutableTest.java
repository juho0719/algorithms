package com.juho.leetCode.challenge.y2021.month08.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RangeSumQueryImmutableTest {

    @Test
    public void rangeSumQueryImmutable01Test() {
        int[] nums = {-2,0,3,-5,2,-1};
        RangeSumQueryImmutable rsqi = new RangeSumQueryImmutable(nums);

        assertEquals(1, rsqi.sumRange(0, 2));
        assertEquals(-1, rsqi.sumRange(2, 5));
        assertEquals(-3, rsqi.sumRange(0, 5));
    }
}
