package com.juho.leetCode.challenge.y2021.month02.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShortestUnsortedContinuousSubarrayTest {
    
    ShortestUnsortedContinuousSubarray sucs = new ShortestUnsortedContinuousSubarray();

    @Test
    public void shortestUnsortedContinuousSubarray01Test() {
        int[] nums01 = {2,6,4,8,10,9,15};
        assertEquals(sucs.findUnsortedSubarray(nums01), 5);
        
        int[] nums02 = {1,2,3,4};
        assertEquals(sucs.findUnsortedSubarray(nums02), 0);

        int[] nums03 = {1};
        assertEquals(sucs.findUnsortedSubarray(nums03), 0);
    }
}
