package com.juho.leetCode.challenge.y2022.month03.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumFrequencyStackTest {

    @Test
    public void maximumFrequencyStack01Test() {
        MaximumFrequencyStack mfs = new MaximumFrequencyStack();
        mfs.push(5);
        mfs.push(7);
        mfs.push(5);
        mfs.push(7);
        mfs.push(4);
        mfs.push(5);
        assertEquals(5, mfs.pop());
        assertEquals(7, mfs.pop());
        assertEquals(5, mfs.pop());
        assertEquals(4, mfs.pop());
    }
}