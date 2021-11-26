package com.juho.leetCode.challenge.month11.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    SearchInsertPosition sip = new SearchInsertPosition();

    @Test
    public void searchInsertPosition01Test() {
        int[] nums01 = {1,3,5,6};
        assertEquals(2, sip.searchInsert(nums01, 5));

        int[] nums02 = {1,3,5,6};
        assertEquals(1, sip.searchInsert(nums02, 2));

        int[] nums03 = {1,3,5,6};
        assertEquals(0, sip.searchInsert(nums03, 0));

        int[] nums04 = {1};
        assertEquals(0, sip.searchInsert(nums04, 0));
    }
}