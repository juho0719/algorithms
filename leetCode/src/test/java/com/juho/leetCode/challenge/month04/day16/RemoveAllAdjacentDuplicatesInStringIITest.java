package com.juho.leetCode.challenge.month04.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveAllAdjacentDuplicatesInStringIITest {

    RemoveAllAdjacentDuplicatesInStringII rads2 = new RemoveAllAdjacentDuplicatesInStringII();

    @Test
    public void RemoveAllAdjacentDuplicatesInStringII01Test() {
        assertEquals("abcd", rads2.removeDuplicates("abcd", 2));
        assertEquals("aa", rads2.removeDuplicates("deeedbbcccbdaa", 3));
        assertEquals("ps", rads2.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
