package com.juho.leetCode.challenge.y2021.month02.day07;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ShortestDistanceToACharacterTest {
    
    ShortestDistanceToACharacter sdtac = new ShortestDistanceToACharacter();

    @Test
    public void shortestDistanceToACharacter01Test() {
        String s01 = "loveleetcode";
        char c01 = 'e';
        int[] result01 = {3,2,1,0,1,0,0,1,2,2,1,0};
        assertArrayEquals(sdtac.shortestToChar(s01, c01), result01);

        String s02 = "aaab";
        char c02 = 'b';
        int[] result02 = {3,2,1,0};
        assertArrayEquals(sdtac.shortestToChar(s02, c02), result02);
    }
}
