package com.juho.leetCode.marchLeetCodingChallenge.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    
    MissingNumber mn = new MissingNumber();

    @Test
    public void missingNumber01Test() {
        int[] nums01 = {3,0,1};
        assertEquals(mn.missingNumber(nums01), 2);

        int[] nums02 = {0,1};
        assertEquals(mn.missingNumber(nums02), 2);

        int[] nums03 = {9,6,4,2,3,5,7,0,1};
        assertEquals(mn.missingNumber(nums03), 8);

        int[] nums04 = {0};
        assertEquals(mn.missingNumber(nums04), 1);
    }
}
