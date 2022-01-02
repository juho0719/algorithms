package com.juho.leetCode.challenge.y2021.month04.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UniquePathsIITest {

    UniquePathsII up2 = new UniquePathsII();

    @Test
    public void uniquePathsII01Test() {
        int[][] obstacleGrid01 = {{0,0,0},{0,1,0},{0,0,0}};
        assertEquals(2, up2.uniquePathsWithObstacles(obstacleGrid01));
        
        int[][] obstacleGrid02 = {{0,1},{0,0}};
        assertEquals(1, up2.uniquePathsWithObstacles(obstacleGrid02));
    }

}
