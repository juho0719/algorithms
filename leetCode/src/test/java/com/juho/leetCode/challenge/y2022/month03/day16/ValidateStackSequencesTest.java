package com.juho.leetCode.challenge.y2022.month03.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidateStackSequencesTest {

    ValidateStackSequences vss = new ValidateStackSequences();

    @Test
    public void validateStackSequences01Test() {
        int[] pushed01 = {1,2,3,4,5};
        int[] popped01 = {4,5,3,2,1};
        assertEquals(true, vss.validateStackSequences(pushed01, popped01));

        int[] pushed02 = {1,2,3,4,5};
        int[] popped02 = {4,3,5,1,2};
        assertEquals(false, vss.validateStackSequences(pushed02, popped02));
    }
}