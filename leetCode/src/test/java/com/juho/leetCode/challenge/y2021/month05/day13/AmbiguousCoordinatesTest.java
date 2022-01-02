package com.juho.leetCode.challenge.y2021.month05.day13;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class AmbiguousCoordinatesTest {

    AmbiguousCoordinates ac = new AmbiguousCoordinates();
    
    @Test
    public void ambiguousCoordinates01Test() {
        String s01 = "(123)";
        String[] result01 = {"(1, 2.3)", "(1, 23)", "(1.2, 3)", "(12, 3)"};
        assertArrayEquals(result01, ac.ambiguousCoordinates(s01).toArray());
    }
}