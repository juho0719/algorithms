package com.juho.leetCode.challenge.y2022.month03.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ChampagneTowerTest {

    ChampagneTower ct = new ChampagneTower();

    @Test
    public void champagneTower01Test() {
        int poured01 = 1;
        int queryRow01 = 1;
        int queryGlass01 = 1;
        double result01 = 0.00000;
        assertEquals(result01, ct.champagneTower(poured01, queryRow01, queryGlass01));

        int poured02 = 2;
        int queryRow02 = 1;
        int queryGlass02 = 1;
        double result02 = 0.50000;
        assertEquals(result02, ct.champagneTower(poured02, queryRow02, queryGlass02));
    }
}