package com.juho.leetCode.challenge.y2021.month12.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DominoAndTrominoTilingTest {

    DominoAndTrominoTiling dtt = new DominoAndTrominoTiling();

    @Test
    public void dominoAndTrominoTiling01Test() {
        int n01 = 3;
        int result01 = 5;
        assertEquals(result01, dtt.numTilings(n01));

        int n02 = 1;
        int result02 = 1;
        assertEquals(result02, dtt.numTilings(n02));
    }
}