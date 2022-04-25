package com.juho.leetCode.challenge.y2022.month04.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PeekingIteratorTest {

    @Test
    public void peekingIterator01Test() {
        List<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        list01.add(3);
        PeekingIterator pi = new PeekingIterator(list01.iterator());
        assertEquals(1, pi.next());
        assertEquals(2, pi.peek());
        assertEquals(2, pi.next());
        assertEquals(3, pi.next());
        assertEquals(false, pi.hasNext());
    }
}