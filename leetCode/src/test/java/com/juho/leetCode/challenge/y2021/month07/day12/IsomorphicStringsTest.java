package com.juho.leetCode.challenge.y2021.month07.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {

    IsomorphicStrings is = new IsomorphicStrings();

    @Test
    public void isomorphicStrings01Test() {
        String s01 = "egg";
        String t01 = "add";
        assertEquals(true, is.isIsomorphic(s01, t01));

        String s02 = "foo";
        String t02 = "bar";
        assertEquals(false, is.isIsomorphic(s02, t02));

        String s03 = "paper";
        String t03 = "title";
        assertEquals(true, is.isIsomorphic(s03, t03));
    }

}
