package com.juho.leetCode.challenge.y2022.month03.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimplifyPathTest {

    SimplifyPath sp = new SimplifyPath();

    @Test
    public void simplifyPath01Test() {
        String path01 = "/home/";
        assertEquals("/home", sp.simplifyPath(path01));
    }
}