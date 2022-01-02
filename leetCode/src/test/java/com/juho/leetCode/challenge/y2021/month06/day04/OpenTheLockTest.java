package com.juho.leetCode.challenge.y2021.month06.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OpenTheLockTest {

    OpenTheLock ol = new OpenTheLock();

    @Test
    public void openTheLock01Test() {
        String[] deadends01 = {"0201", "0101", "0102", "1212", "2002"};
        String target01 = "0202";
        assertEquals(6, ol.openLock(deadends01, target01));

        String[] deadends02 = {"8888"};
        String target02 = "0009";
        assertEquals(1, ol.openLock(deadends02, target02));

        String[] deadends03 = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target03 = "8888";
        assertEquals(-1, ol.openLock(deadends03, target03));

        String[] deadends04 = {"0000"};
        String target04 = "8888";
        assertEquals(-1, ol.openLock(deadends04, target04));
    }

}
