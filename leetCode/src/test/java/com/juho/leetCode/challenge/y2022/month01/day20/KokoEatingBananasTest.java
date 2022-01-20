package com.juho.leetCode.challenge.y2022.month01.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {
    
    KokoEatingBananas keb = new KokoEatingBananas();

    @Test
    public void kokoEatingBananasII01Test() {
        int[] piles01 = {3,6,7,11};
        int h01 = 8;
        assertEquals(4, keb.minEatingSpeed(piles01, h01));
    }
}