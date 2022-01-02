package com.juho.leetCode.challenge.y2021.month05.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumPointsYouCanObtainFromCardsTest {

    MaximumPointsYouCanObtainFromCards mpycofc = new MaximumPointsYouCanObtainFromCards();

    @Test
    public void maximumPointsYouCanObtainFromCards01Test() {
        int[] cardPoints01 = {1,2,3,4,5,6,1};
        int k01 = 3;
        assertEquals(12, mpycofc.maxScore(cardPoints01, k01));

        int[] cardPoints02 = {2,2,2};
        int k02 = 2;
        assertEquals(4, mpycofc.maxScore(cardPoints02, k02));

        int[] cardPoints03 = {9,7,7,9,7,7,9};
        int k03 = 7;
        assertEquals(55, mpycofc.maxScore(cardPoints03, k03));

        int[] cardPoints04 = {1,1000,1};
        int k04 = 1;
        assertEquals(1, mpycofc.maxScore(cardPoints04, k04));

        int[] cardPoints05 = {1,79,80,1,1,1,200,1};
        int k05 = 3;
        assertEquals(202, mpycofc.maxScore(cardPoints05, k05));

        int[] cardPoints06 = {100,40,17,9,73,75};
        int k06 = 3;
        assertEquals(248, mpycofc.maxScore(cardPoints06, k06));
    }
}