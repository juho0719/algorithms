package com.juho.leetCode.challenge.month03.day22;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class VowelSpellcheckerTest {
    
    VowelSpellchecker vs = new VowelSpellchecker();

    @Test
    public void vowelSpellchecker01Test() {
        String[] wordlist01 = {"KiTe","kite","hare","Hare"};
        String[] queries01 = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        String[] result01 = {"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"};
        assertArrayEquals(result01, vs.spellchecker(wordlist01, queries01));

        String[] wordlist02 = {"yellow"};
        String[] queries02 = {"YellOw"};
        String[] result02 = {"yellow"};
        assertArrayEquals(result02, vs.spellchecker(wordlist02, queries02));
    }
}
