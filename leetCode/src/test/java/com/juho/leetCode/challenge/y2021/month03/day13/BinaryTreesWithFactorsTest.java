package com.juho.leetCode.challenge.y2021.month03.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinaryTreesWithFactorsTest {
    
    BinaryTreesWithFactors btf = new BinaryTreesWithFactors();

    @Test
    public void checkIfAStringContainsAllBinaryCodesOfSizeK01Test() {
        int[] arr01 = {2,4};
        assertEquals(btf.numFactoredBinaryTrees(arr01), 3);

        int[] arr02 = {2,4,5,10};
        assertEquals(btf.numFactoredBinaryTrees(arr02), 7);
    }
}
