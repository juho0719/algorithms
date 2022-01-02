package com.juho.leetCode.challenge.y2021.month04.day30;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PowerfulIntegersTest {

    PowerfulIntegers pi = new PowerfulIntegers();

    @Test
    public void powerfulIntegers01Test() {
        int x01 = 2;
        int y01 = 3;
        int bound01 = 10;
        int[] result01 = {2,3,4,5,7,9,10};
        assertArrayEquals(result01, pi.powerfulIntegers(x01, y01, bound01).stream().mapToInt(Integer::intValue).toArray());

        int x02 = 3;
        int y02 = 5;
        int bound02 = 15;
        int[] result02 = {2,4,6,8,10,14};
        assertArrayEquals(result02, pi.powerfulIntegers(x02, y02, bound02).stream().mapToInt(Integer::intValue).toArray());
    }

}
