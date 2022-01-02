package com.juho.leetCode.challenge.y2021.month09.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MaximumLengthOfaConcatenatedStringWithUniqueCharactersTest {

    MaximumLengthOfaConcatenatedStringWithUniqueCharacters mlcsuc = new MaximumLengthOfaConcatenatedStringWithUniqueCharacters();

    @Test
    public void maximumLengthOfaConcatenatedStringWithUniqueCharacters01Test() {
        List<String> arr01 = new ArrayList<>();
        arr01.add("un");
        arr01.add("iq");
        arr01.add("ue");
        assertEquals(4, mlcsuc.maxLength(arr01));

        List<String> arr02 = new ArrayList<>();
        arr02.add("cha");
        arr02.add("r");
        arr02.add("act");
        arr02.add("ers");
        assertEquals(6, mlcsuc.maxLength(arr02));

        List<String> arr03 = new ArrayList<>();
        arr03.add("abcdefghijklmnopqrstuvwxyz");
        assertEquals(26, mlcsuc.maxLength(arr03));
    }
}