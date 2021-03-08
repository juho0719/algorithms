package com.juho.leetCode.marchLeetCodingChallenge.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DesignHashMapTest {
    
    DesignHashMap dhm = new DesignHashMap();

    @Test
    public void designHashMap01Test() {
        MyHashMap obj = dhm.getMyHashMap();
        obj.put(1, 2);
        int param_2 = obj.get(1);
        obj.remove(1);
        assertEquals(param_2, 2);
    }
}
