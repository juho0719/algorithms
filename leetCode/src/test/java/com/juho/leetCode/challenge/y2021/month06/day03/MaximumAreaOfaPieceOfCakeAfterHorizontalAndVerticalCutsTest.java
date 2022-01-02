package com.juho.leetCode.challenge.y2021.month06.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts mpcahvc = new MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    public void maximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts01Test() {
        int h01 = 5;
        int w01 = 4;
        int[] horizontalCuts01 = {1,2,4};
        int[] verticalCuts01 = {1,3};
        assertEquals(4, mpcahvc.maxArea(h01, w01, horizontalCuts01, verticalCuts01));

        int h02 = 5;
        int w02 = 4;
        int[] horizontalCuts02 = {3,1};
        int[] verticalCuts02 = {1};
        assertEquals(6, mpcahvc.maxArea(h02, w02, horizontalCuts02, verticalCuts02));

        int h03 = 5;
        int w03 = 4;
        int[] horizontalCuts03 = {3};
        int[] verticalCuts03 = {3};
        assertEquals(9, mpcahvc.maxArea(h03, w03, horizontalCuts03, verticalCuts03));
    }

}
