package com.juho.leetCode.jenuaryLeetCodingChallenge.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.jenuaryLeetCodingChallenge.day25.CheckIfAll1sAreAtLeastLengthKPlacesAway;

import org.junit.jupiter.api.Test;

public class CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {

    CheckIfAll1sAreAtLeastLengthKPlacesAway cia1aallkpa = new CheckIfAll1sAreAtLeastLengthKPlacesAway();

    @Test
    public void checkIfAll1sAreAtLeastLengthKPlacesAway01Test() {
        int[] nums01 = {1,0,0,0,1,0,0,1};
        int k01 = 2;
        assertEquals(cia1aallkpa.kLengthApart(nums01, k01), true);

        int[] nums02 = {1,0,0,1,0,1};
        int k02 = 2;
        assertEquals(cia1aallkpa.kLengthApart(nums02, k02), false);

        int[] nums03 = {1,1,1,1,1};
        int k03 = 0;
        assertEquals(cia1aallkpa.kLengthApart(nums03, k03), true);

        int[] nums04 = {0,1,0,1};
        int k04 = 1;
        assertEquals(cia1aallkpa.kLengthApart(nums04, k04), true);
    }
}