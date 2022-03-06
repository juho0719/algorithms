package com.juho.leetCode.challenge.y2022.month03.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountAllValidPickupAndDeliveryOptionsTest {

    CountAllValidPickupAndDeliveryOptions cap = new CountAllValidPickupAndDeliveryOptions();

    @Test
    public void countAllValidPickupAndDeliveryOptions01Test() {
        int n01 = 1;
        assertEquals(1, cap.countOrders(n01));

        int n02 = 2;
        assertEquals(6, cap.countOrders(n02));
    }
}