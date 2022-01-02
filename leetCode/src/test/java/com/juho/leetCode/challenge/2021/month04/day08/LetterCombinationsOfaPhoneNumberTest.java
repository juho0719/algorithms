package com.juho.leetCode.challenge.month04.day08;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class LetterCombinationsOfaPhoneNumberTest {

    @Test
    public void letterCombinationsOfaPhoneNumber01Test() {
        LetterCombinationsOfaPhoneNumber lcpn01 = new LetterCombinationsOfaPhoneNumber();
        String digits01 = "23";
        String[] result01 = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        assertArrayEquals(result01, lcpn01.letterCombinations(digits01).toArray());

        LetterCombinationsOfaPhoneNumber lcpn02 = new LetterCombinationsOfaPhoneNumber();
        String digits02 = "";
        String[] result02 = {};
        assertArrayEquals(result02, lcpn02.letterCombinations(digits02).toArray());

        LetterCombinationsOfaPhoneNumber lcpn03 = new LetterCombinationsOfaPhoneNumber();
        String digits03 = "2";
        String[] result03 = {"a", "b", "c"};
        assertArrayEquals(result03, lcpn03.letterCombinations(digits03).toArray());
    }
}
