package com.juho.leetCode.challenge.month10.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InsertDeleteGetRandomO1Test {

    @Test
    public void insertDeleteGetRandomO101Test() {
        InsertDeleteGetRandomO1 obj = new InsertDeleteGetRandomO1();
        assertEquals(true, obj.insert(1));
        assertEquals(false, obj.remove(2));
        assertEquals(true, obj.insert(2));
        assertEquals(true, obj.remove(2));
    }
}