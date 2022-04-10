package com.juho.leetCode.challenge.y2022.month04.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {

    BaseballGame bg = new BaseballGame();

    @Test
    public void baseballGame01Test() {
        String[] ops01 = {"5","2","C","D","+"};
        assertEquals(30, bg.calPoints(ops01));

        String[] ops02 = {"5","-2","4","C","D","9","+","+"};
        assertEquals(27, bg.calPoints(ops02));
    }
}