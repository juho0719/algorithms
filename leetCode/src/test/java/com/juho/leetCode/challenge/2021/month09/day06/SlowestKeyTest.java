package com.juho.leetCode.challenge.month09.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SlowestKeyTest {

    SlowestKey sk = new SlowestKey();

    @Test
    public void slowestKey01Test() {
        int[] releaseTimes01 = {9,29,49,50};
        String keysPressed01 = "cbcd";
        assertEquals('c', sk.slowestKey(releaseTimes01, keysPressed01));

        int[] releaseTimes02 = {12,23,36,46,62};
        String keysPressed02 = "spuda";
        assertEquals('a', sk.slowestKey(releaseTimes02, keysPressed02));
    }
}