package com.juho.leetCode.februaryLeetCodingChallenge.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.FreqStack;
import org.junit.jupiter.api.Test;

public class MaximumFrequencyStackTest {
    
    MaximumFrequencyStack mfs = new MaximumFrequencyStack();

    @Test
    public void shortestUnsortedContinuousSubarray01Test() {
        FreqStack fs = mfs.getFreqStack();
        fs.push(5);
        fs.push(7);
        fs.push(5);
        fs.push(7);
        fs.push(4);
        fs.push(5);

        assertEquals(fs.pop(), 5);
        assertEquals(fs.pop(), 7);
        assertEquals(fs.pop(), 5);
        assertEquals(fs.pop(), 4);
    }
}
