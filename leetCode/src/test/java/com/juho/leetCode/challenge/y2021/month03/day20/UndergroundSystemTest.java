package com.juho.leetCode.challenge.y2021.month03.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UndergroundSystemTest {
    
    UndergroundSystem us = new UndergroundSystem();

    @Test
    public void undergroundSystem01Test() {
        us.checkIn(45, "Leyton", 3);
        us.checkIn(32, "Paradise", 8);
        us.checkIn(27, "Leyton", 10);
        us.checkOut(45, "Waterloo", 15);
        us.checkOut(27, "Waterloo", 20);
        us.checkOut(32, "Cambridge", 22);
        double avg01 = 14;
        assertEquals(avg01, us.getAverageTime("Paradise", "Cambridge"));
        double avg02 = 11;
        assertEquals(avg02, us.getAverageTime("Leyton", "Waterloo"));
        
        us.checkIn(10, "Leyton", 24);

        double avg03 = 11;
        assertEquals(avg03, us.getAverageTime("Leyton", "Waterloo"));
        
        us.checkOut(10, "Waterloo", 38);

        double avg04 = 12;
        assertEquals(avg04, us.getAverageTime("Leyton", "Waterloo"));
    }
}
