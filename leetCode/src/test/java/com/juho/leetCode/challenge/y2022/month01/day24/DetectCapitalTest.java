package com.juho.leetCode.challenge.y2022.month01.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DetectCapitalTest {
    
    DetectCapital dc = new DetectCapital();

    @Test
    public void detectCapital01Test() {
        String word01 = "USA";
        assertEquals(true, dc.detectCapitalUse(word01));   

        String word02 = "FlaG";
        assertEquals(false, dc.detectCapitalUse(word02));   
    }
}