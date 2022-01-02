package com.juho.leetCode.challenge.month06.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StoneGameVIITest {

    StoneGameVII sg7 = new StoneGameVII();

    @Test
    public void stoneGameVII01Test() {
        int[] stones01 = {5,3,1,4,2};
        assertEquals(6, sg7.stoneGameVII(stones01));
        
        int[] stones02 = {7,90,5,1,100,10,10,2};
        assertEquals(122, sg7.stoneGameVII(stones02));
    }

}
