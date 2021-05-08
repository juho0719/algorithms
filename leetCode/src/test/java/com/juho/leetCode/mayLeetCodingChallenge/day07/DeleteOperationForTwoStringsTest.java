package com.juho.leetCode.mayLeetCodingChallenge.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DeleteOperationForTwoStringsTest {

    DeleteOperationForTwoStrings dpfts = new DeleteOperationForTwoStrings();

    @Test
    public void deleteOperationForTwoStrings01Test() {
        String word101 = "sea";
        String word102 = "eat";
        assertEquals(2, dpfts.minDistance(word101, word102));

        String word201 = "leetcode";
        String word202 = "etco";
        assertEquals(4, dpfts.minDistance(word201, word202));
    }

}
