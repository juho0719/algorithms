package com.juho.leetCode.marchLeetCodingChallenge.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DistributeCandiesTest {
    
    DistributeCandies dc = new DistributeCandies();

    @Test
    public void distributeCandies01Test() {
        int[] candyType01 = {1,1,2,2,3,3};
        assertEquals(dc.distributeCandies(candyType01), 3);

        int[] candyType02 = {1,1,2,3};
        assertEquals(dc.distributeCandies(candyType02), 2);

        int[] candyType03 = {6,6,6,6};
        assertEquals(dc.distributeCandies(candyType03), 1);
    }
}
