package com.juho.leetCode.challenge.y2021.month02.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidateStackSequencesTest {
    
    ValidateStackSequences vss = new ValidateStackSequences();

    @Test
    public void shortestUnsortedContinuousSubarray01Test() {
        int[] pushed01 = {1,2,3,4,5};
        int[] popped01 = {4,5,3,2,1};
        assertEquals(vss.validateStackSequences(pushed01, popped01), true);
        
        int[] pushed02 = {1,2,3,4,5};
        int[] popped02 = {4,3,5,1,2};
        assertEquals(vss.validateStackSequences(pushed02, popped02), false);
    }
}
