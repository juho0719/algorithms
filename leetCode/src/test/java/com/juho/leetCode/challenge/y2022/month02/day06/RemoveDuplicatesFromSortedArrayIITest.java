package com.juho.leetCode.challenge.y2022.month02.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    RemoveDuplicatesFromSortedArrayII rdsa2 = new RemoveDuplicatesFromSortedArrayII();

    @Test
    public void removeDuplicatesFromSortedArrayII01Test() {
        int[] nums01 = {1,1,1,2,2,3};
        assertEquals(5, rdsa2.removeDuplicates(nums01));
    }
}