package com.juho.leetCode.challenge.y2021.month08.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveBoxesTest {

    RemoveBoxes rb = new RemoveBoxes();

    @Test
    public void removeBoxes01Test() {
        int[] boxes01 = {1,3,2,2,2,3,4,3,1};
        assertEquals(23, rb.removeBoxes(boxes01));
    }
}
