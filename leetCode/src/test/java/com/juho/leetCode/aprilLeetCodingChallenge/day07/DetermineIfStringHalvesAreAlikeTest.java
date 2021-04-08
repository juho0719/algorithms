package com.juho.leetCode.aprilLeetCodingChallenge.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DetermineIfStringHalvesAreAlikeTest {

    DetermineIfStringHalvesAreAlike disha = new DetermineIfStringHalvesAreAlike();

    @Test
    public void determineIfStringHalvesAreAlike01Test() {
        String s01 = "book";
        assertEquals(true, disha.halvesAreAlike(s01));

        String s02 = "textbook";
        assertEquals(false, disha.halvesAreAlike(s02));

        String s03 = "MerryChristmas";
        assertEquals(false, disha.halvesAreAlike(s03));

        String s04 = "AbCdEfGh";
        assertEquals(true, disha.halvesAreAlike(s04));
    }
}
