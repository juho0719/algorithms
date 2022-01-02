package com.juho.leetCode.challenge.month04.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DesignCircularQueueTest {

    @Test
    public void designCircularQueue01Test() {
        DesignCircularQueue dcq = new DesignCircularQueue(3);
        
        assertEquals(true, dcq.enQueue(1));
        assertEquals(true, dcq.enQueue(2));
        assertEquals(true, dcq.enQueue(3));
        assertEquals(false, dcq.enQueue(4));
        assertEquals(3, dcq.Rear());
        assertEquals(true, dcq.isFull());
        assertEquals(true, dcq.deQueue());
        assertEquals(true, dcq.enQueue(4));
        assertEquals(4, dcq.Rear());
    }
}
