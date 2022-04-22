package com.juho.leetCode.challenge.y2022.month04.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DesignHashMapTest {

    @Test
    public void designHashSet01Test() {
        DesignHashMap dhm = new DesignHashMap();
        dhm.put(1, 1);
        dhm.put(2, 2);
        assertEquals(1, dhm.get(1));
        assertEquals(-1, dhm.get(3));
        dhm.put(2, 1);
        assertEquals(1, dhm.get(2));
        dhm.remove(2);
        assertEquals(-1, dhm.get(2));
    }
}