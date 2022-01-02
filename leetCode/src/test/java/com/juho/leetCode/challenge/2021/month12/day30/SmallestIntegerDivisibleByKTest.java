package com.juho.leetCode.challenge.month12.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SmallestIntegerDivisibleByKTest {

    SmallestIntegerDivisibleByK sid = new SmallestIntegerDivisibleByK();

    @Test
    public void smallestIntegerDivisibleByK01Test() {
        int k01 = 1;
        assertEquals(1, sid.smallestRepunitDivByK(k01));

        int k02 = 2;
        assertEquals(-1, sid.smallestRepunitDivByK(k02));

        int k03 = 3;
        assertEquals(3, sid.smallestRepunitDivByK(k03));
    }
}