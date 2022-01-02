package com.juho.leetCode.challenge.month06.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CandyTest {

    Candy candy = new Candy();

    @Test
    public void candy01Test() {
        int[] ratings01 = {1,0,2};
        assertEquals(5, candy.candy(ratings01));

        int[] ratings02 = {1,2,2};
        assertEquals(4, candy.candy(ratings02));
    }

}
