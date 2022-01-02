package com.juho.leetCode.challenge.month06.day25;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RedundantConnectionTest {

    RedundantConnection rc = new RedundantConnection();

    @Test
    public void redundantConnection01Test() {
        int[][] edges01 = {{1,2},{1,3},{2,3}};
        int[] result01 = {2,3};
        assertArrayEquals(result01, rc.findRedundantConnection(edges01));

        int[][] edges02 = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        int[] result02 = {1,4};
        assertArrayEquals(result02, rc.findRedundantConnection(edges02));
    }

}
