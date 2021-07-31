package com.juho.leetCode.challenge.month07.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MapSumPairsTest {

    @Test
    public void mapSumPairs01Test() {
        MapSumPairs msp = new MapSumPairs();
        msp.insert("apple", 3);
        assertEquals(3, msp.sum("ap"));
        msp.insert("app", 2);
        assertEquals(5, msp.sum("ap"));
    }
}
