package com.juho.leetCode.challenge.month06.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyCalendarITest {

    MyCalendarI mc = new MyCalendarI();

    @Test
    public void myCalendarI01Test() {
        MyCalendarI mc = new MyCalendarI();

        assertEquals(true, mc.book(10, 20));
        assertEquals(false, mc.book(15, 25));
        assertEquals(true, mc.book(20, 30));
    }

}
