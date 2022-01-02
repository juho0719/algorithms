package com.juho.leetCode.challenge.y2021.month05.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindTheShortestSuperstringTest {
    
    FindTheShortestSuperstring fss = new FindTheShortestSuperstring();

    @Test
    public void findTheShortestSuperstring01Test() {
        String[] words01 = {"alex","loves","leetcode"};
        String result01 = "alexlovesleetcode";
        assertEquals(result01, fss.shortestSuperstring(words01));
    }
}