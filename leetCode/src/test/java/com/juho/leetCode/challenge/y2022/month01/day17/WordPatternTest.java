package com.juho.leetCode.challenge.y2022.month01.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WordPatternTest {
    
    WordPattern wp = new WordPattern();

    @Test
    public void wordPattern01Test() {
        String pattern01 = "abba";
        String s01 = "dog cat cat dog";
        assertEquals(true, wp.wordPattern(pattern01, s01));
        
    }
}