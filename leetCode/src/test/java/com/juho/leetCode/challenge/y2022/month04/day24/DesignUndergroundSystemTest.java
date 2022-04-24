package com.juho.leetCode.challenge.y2022.month04.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DesignUndergroundSystemTest {

    @Test
    public void designUndergroundSystem01Test() {
        DesignUndergroundSystem dus = new DesignUndergroundSystem();
        dus.checkIn(45, "Leyton", 3);
        dus.checkIn(32, "Paradise", 8);
        dus.checkIn(27, "Leyton", 10);
        dus.checkOut(45, "Waterloo", 15);
        dus.checkOut(27, "Waterloo", 20);
        dus.checkOut(32, "Cambridge", 22);
        assertEquals(14.0, dus.getAverageTime("Paradise", "Cambridge"));
        assertEquals(11.0, dus.getAverageTime("Leyton", "Waterloo"));

        dus.checkIn(10, "Leyton", 24);
        assertEquals(11.0, dus.getAverageTime("Leyton", "Waterloo"));

        dus.checkOut(10, "Waterloo", 38);
        assertEquals(12.0, dus.getAverageTime("Leyton", "Waterloo"));
    }
}