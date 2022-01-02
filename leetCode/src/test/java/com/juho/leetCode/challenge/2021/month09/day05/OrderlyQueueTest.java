package com.juho.leetCode.challenge.month09.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrderlyQueueTest {

    OrderlyQueue oq = new OrderlyQueue();

    @Test
    public void orderlyQueue01Test() {
        String s01 = "cba";
        int k01 = 1;
        assertEquals("acb", oq.orderlyQueue(s01, k01));

        String s02 = "baaca";
        int k02 = 3;
        assertEquals("aaabc", oq.orderlyQueue(s02, k02));
    }
}