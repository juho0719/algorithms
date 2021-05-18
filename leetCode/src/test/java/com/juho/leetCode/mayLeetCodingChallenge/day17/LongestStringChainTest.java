package com.juho.leetCode.mayLeetCodingChallenge.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestStringChainTest {

    LongestStringChain lsc = new LongestStringChain();
    
    @Test
    public void binaryTreeCameras01Test() {
        String[] words01 = {"a","b","ba","bca","bda","bdca"};
        assertEquals(4, lsc.longestStrChain(words01));

        String[] words02 = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        assertEquals(5, lsc.longestStrChain(words02));
    }
}