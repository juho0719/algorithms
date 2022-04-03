package com.juho.leetCode.challenge.y2022.month03.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayIITest {

    SearchInRotatedSortedArrayII sr2 = new SearchInRotatedSortedArrayII();

    @Test
    public void searchInRotatedSortedArrayII01Test() {
        int[] nums01 = {2,5,6,0,0,1,2};
        int target01 = 0;
        assertEquals(true, sr2.search(nums01, target01));
    }
}