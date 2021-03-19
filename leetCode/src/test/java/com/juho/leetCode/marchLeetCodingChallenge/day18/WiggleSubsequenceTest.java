package com.juho.leetCode.marchLeetCodingChallenge.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WiggleSubsequenceTest {
    
    WiggleSubsequence ws = new WiggleSubsequence();

    @Test
    public void wiggleSubsequence01Test() {
        int[] nums01 = {1,7,4,9,2,5};
        assertEquals(6, ws.wiggleMaxLength(nums01));

        int[] nums02 = {1,17,5,10,13,15,10,5,16,8};
        assertEquals(7, ws.wiggleMaxLength(nums02));

        int[] nums03 = {1,2,3,4,5,6,7,8,9};
        assertEquals(2, ws.wiggleMaxLength(nums03));

        int[] nums04 = {3,3,3,2,5};
        assertEquals(3, ws.wiggleMaxLength(nums04));
    }
}
