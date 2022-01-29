package com.juho.leetCode.challenge.y2022.month01.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram lrh = new LargestRectangleInHistogram();

    @Test
    public void largestRectangleInHistogram01Test() {
        int[] heights01 = {2,1,5,6,2,3};
        assertEquals(10, lrh.largestRectangleArea(heights01));

        int[] heights02 = {2,4};
        assertEquals(4, lrh.largestRectangleArea(heights02));
    }
}