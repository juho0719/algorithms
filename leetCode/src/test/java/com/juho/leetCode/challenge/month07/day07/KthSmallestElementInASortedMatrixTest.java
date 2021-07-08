package com.juho.leetCode.challenge.month07.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KthSmallestElementInASortedMatrixTest {

    KthSmallestElementInASortedMatrix kesm = new KthSmallestElementInASortedMatrix();

    @Test
    public void kthSmallestElementInASortedMatrix01Test() {
        int[][] matrix01 = {{1,5,9},{10,11,13},{12,13,15}};
        int k01 = 8;
        assertEquals(13, kesm.kthSmallest(matrix01, k01));

        int[][] matrix02 = {{-5}};
        int k02 = 1;
        assertEquals(-5, kesm.kthSmallest(matrix02, k02));
    }

}
