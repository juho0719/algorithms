package com.juho.leetCode.challenge.y2021.month10.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GuessNumberHigherOrLowerTest {

    @Test
    public void guessNumberHigherOrLower01Test() {
        GuessNumberHigherOrLower gnhl01 = new GuessNumberHigherOrLower(6);
        int n01 = 10;
        assertEquals(6, gnhl01.guessNumber(n01));

        GuessNumberHigherOrLower gnhl02 = new GuessNumberHigherOrLower(1);
        int n02 = 1;
        assertEquals(1, gnhl02.guessNumber(n02));

        GuessNumberHigherOrLower gnhl03 = new GuessNumberHigherOrLower(1);
        int n03 = 2;
        assertEquals(1, gnhl03.guessNumber(n03));

        GuessNumberHigherOrLower gnhl04 = new GuessNumberHigherOrLower(2);
        int n04 = 2;
        assertEquals(2, gnhl04.guessNumber(n04));
    }
}