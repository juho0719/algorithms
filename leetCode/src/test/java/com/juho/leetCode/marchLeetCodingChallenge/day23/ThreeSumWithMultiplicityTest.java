package com.juho.leetCode.marchLeetCodingChallenge.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ThreeSumWithMultiplicityTest {
    
    ThreeSumWithMultiplicity tsm = new ThreeSumWithMultiplicity();

    @Test
    public void threeSumWithMultiplicity01Test() {
        int[] arr01 = {1,1,2,2,3,3,4,4,5,5};
        int target01 = 8;
        assertEquals(20, tsm.threeSumMulti(arr01, target01));

        int[] arr02 = {1,1,2,2,2,2};
        int target02 = 5;
        assertEquals(12, tsm.threeSumMulti(arr02, target02));
    }
}
