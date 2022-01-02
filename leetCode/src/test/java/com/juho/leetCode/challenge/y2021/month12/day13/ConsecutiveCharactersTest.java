package com.juho.leetCode.challenge.y2021.month12.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConsecutiveCharactersTest {

    ConsecutiveCharacters cc = new ConsecutiveCharacters();

    @Test
    public void consecutiveCharacters01Test() {
        String s01 = "leetcode";
        assertEquals(2, cc.maxPower(s01));

        String s02 = "abbcccddddeeeeedcba";
        assertEquals(5, cc.maxPower(s02));

        String s03 = "triplepillooooow";
        assertEquals(5, cc.maxPower(s03));

        String s04 = "hooraaaaaaaaaaay";
        assertEquals(11, cc.maxPower(s04));

        String s05 = "tourist";
        assertEquals(1, cc.maxPower(s05));
    }
}