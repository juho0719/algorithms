package com.juho.leetCode.decemberLeetCodingChallenge.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CreateSortedArrayThroughInstructionsTest {

    CreateSortedArrayThroughInstructions csati = new CreateSortedArrayThroughInstructions();

    @Test
    public void createSortedArrayThroughInstructions01Test() {
        int[] instructions01 = {1,5,6,2};
        assertEquals(csati.createSortedArray(instructions01), 1);

        int[] instructions02 = {1,2,3,6,5,4};
        assertEquals(csati.createSortedArray(instructions02), 3);

        int[] instructions03 = {1,3,3,3,2,4,2,1,2};
        assertEquals(csati.createSortedArray(instructions03), 4);
    }
}