package com.juho.leetCode.challenge.month09.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseOnlyLettersTest {

    ReverseOnlyLetters rol = new ReverseOnlyLetters();

    @Test
    public void reverseOnlyLetters01Test() {
        String s01 = "ab-cd";
        assertEquals("dc-ba", rol.reverseOnlyLetters(s01));

        String s02 = "a-bC-dEf-ghIj";
        assertEquals("j-Ih-gfE-dCba", rol.reverseOnlyLetters(s02));

        String s03 = "Test1ng-Leet=code-Q!";
        assertEquals("Qedo1ct-eeLg=ntse-T!", rol.reverseOnlyLetters(s03));

    }
}