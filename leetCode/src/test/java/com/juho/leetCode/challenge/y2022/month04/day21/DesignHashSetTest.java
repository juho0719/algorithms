package com.juho.leetCode.challenge.y2022.month04.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DesignHashSetTest {

    @Test
    public void designHashSet01Test() {
        DesignHashSet dhs = new DesignHashSet();
        dhs.add(1);
        assertEquals(true, dhs.contains(1));
        assertEquals(false, dhs.contains(3));
        dhs.add(2);
        assertEquals(true, dhs.contains(2));
        dhs.remove(2);
        assertEquals(false, dhs.contains(2));
    }
}