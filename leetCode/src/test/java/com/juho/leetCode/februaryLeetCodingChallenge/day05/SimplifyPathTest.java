package com.juho.leetCode.februaryLeetCodingChallenge.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimplifyPathTest {
    
    SimplifyPath sp = new SimplifyPath();

    @Test
    public void simplifyPath01Test() {
        String path01 = "/home/";
        assertEquals(sp.simplifyPath(path01), "/home");

        String path02 = "/../";
        assertEquals(sp.simplifyPath(path02), "/");

        String path03 = "/home//foo/";
        assertEquals(sp.simplifyPath(path03), "/home/foo");

        String path04 = "/a/./b/../../c/";
        assertEquals(sp.simplifyPath(path04), "/c");

        String path05 = "/a//b////c/d//././/..";
        assertEquals(sp.simplifyPath(path05), "/a/b/c");
    }
}
