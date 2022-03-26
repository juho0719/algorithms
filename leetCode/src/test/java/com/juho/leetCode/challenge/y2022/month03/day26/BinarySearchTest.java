package com.juho.leetCode.challenge.y2022.month03.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    public void binarySearch01Test() {
        int[] nums01 = {-1,0,3,5,9,12};
        int target01 = 9;
        assertEquals(4, bs.search(nums01, target01));
    }
}