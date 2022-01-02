package com.juho.leetCode.challenge.y2021.month10.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinStackTest {

    @Test
    public void minStack01Test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }
}