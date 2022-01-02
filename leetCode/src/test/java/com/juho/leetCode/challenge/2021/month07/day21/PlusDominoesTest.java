package com.juho.leetCode.challenge.month07.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlusDominoesTest {

    PlusDominoes pd = new PlusDominoes();

    @Test
    public void plusDominoes01Test() {
        String dominoes01 = "RR.L";
        String result01 = "RR.L";
        assertEquals(result01, pd.pushDominoes(dominoes01));

        String dominoes02 = ".L.R...LR..L..";
        String result02 = "LL.RR.LLRRLL..";
        assertEquals(result02, pd.pushDominoes(dominoes02));
    }

}
