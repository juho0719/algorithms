package com.juho.leetCode.februaryLeetCodingChallenge.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PeekingIteratorTest {
    
    @Test
    public void peekingIterator01Test() {
        List<Integer> param01 = new ArrayList<>();
        param01.add(1);
        param01.add(2);
        param01.add(3);
        PeekingIterator pi01 = new PeekingIterator(param01.iterator());
        
        assertEquals(pi01.next(), 1);
        assertEquals(pi01.peek(), 2);
        assertEquals(pi01.next(), 2);
        assertEquals(pi01.next(), 3);
    }
}
