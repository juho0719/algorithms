package com.juho.leetCode.challenge.y2022.month01.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {
    
    CanPlaceFlowers cpf = new CanPlaceFlowers();

    @Test
    public void canPlaceFlowers01Test() {
        int[] flowerbed01 = {1,0,0,0,1};
        int n01 = 1;
        assertEquals(true, cpf.canPlaceFlowers(flowerbed01, n01));

        int[] flowerbed02 = {1,0,0,0,1};
        int n02 = 2;
        assertEquals(false, cpf.canPlaceFlowers(flowerbed02, n02));
    }
}