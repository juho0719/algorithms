package com.juho.leetCode.challenge.y2022.month01.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumXORofTwoNumbersInAnArrayTest {
    
    MaximumXORofTwoNumbersInAnArray mtna = new MaximumXORofTwoNumbersInAnArray();

    @Test
    public void maximumXORofTwoNumbersInAnArray01Test() {
        int[] nums01 = {3,10,5,25,2,8};
        assertEquals(28, mtna.findMaximumXOR(nums01)); 
    }
}