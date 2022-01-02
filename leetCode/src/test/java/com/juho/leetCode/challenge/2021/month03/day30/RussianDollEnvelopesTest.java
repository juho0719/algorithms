package com.juho.leetCode.challenge.month03.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RussianDollEnvelopesTest {
    
    RussianDollEnvelopes rde = new RussianDollEnvelopes();

    @Test
    public void russianDollEnvelopes01Test() {
        int[][] envelopes01 = {{5,4}, {6,4}, {6,7}, {2,3}};
        assertEquals(3, rde.maxEnvelopes(envelopes01));

        int[][] envelopes02 = {{1,1}, {1,1}, {1,1}};
        assertEquals(1, rde.maxEnvelopes(envelopes02));
    }
}
