package com.juho.leetCode.challenge.y2021.month03.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReorderedPowerOf2Test {
    
    ReorderedPowerOf2 rp2 = new ReorderedPowerOf2();

    @Test
    public void reorderedPowerOf201Test() {
        int num01 = 1;
        assertEquals(true, rp2.reorderedPowerOf2(num01));

        int num02 = 10;
        assertEquals(false, rp2.reorderedPowerOf2(num02));

        int num03 = 16;
        assertEquals(true, rp2.reorderedPowerOf2(num03));

        int num04 = 24;
        assertEquals(false, rp2.reorderedPowerOf2(num04));

        int num05 = 46;
        assertEquals(true, rp2.reorderedPowerOf2(num05));
    }
}
