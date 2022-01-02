package com.juho.leetCode.challenge.y2021.month11.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IteratorForCombinationTest {

    @Test
    public void iteratorForCombination01Test() {
        IteratorForCombination ic = new IteratorForCombination("abc", 2);
        assertEquals("ab", ic.next());
        assertEquals(true, ic.hasNext());
        assertEquals("ac", ic.next());
        assertEquals(true, ic.hasNext());
        assertEquals("bc", ic.next());
        assertEquals(false, ic.hasNext());
    }
}