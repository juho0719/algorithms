package com.juho.leetCode.challenge.y2021.month07.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

    ThreeSumClosest tsc = new ThreeSumClosest();

    @Test
    public void convertSortedArrayToBinarySearchTree01Test() {
        int[] nums01 = {-1,2,1,-4};
        int target01 = 1;
        assertEquals(2, tsc.threeSumClosest(nums01, target01));
    }

}
