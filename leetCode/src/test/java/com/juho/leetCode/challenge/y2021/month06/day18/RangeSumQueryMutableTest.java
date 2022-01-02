package com.juho.leetCode.challenge.y2021.month06.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RangeSumQueryMutableTest {

    @Test
    public void rangeSumQueryMutable01Test() {
        int[] nums01 = {1,3,5};
        RangeSumQueryMutable rsqm = new RangeSumQueryMutable(nums01);
        assertEquals(9, rsqm.sumRange(0, 2));

        rsqm.update(1, 2);
        assertEquals(8, rsqm.sumRange(0, 2));
    }

}
