package com.juho.leetCode.challenge.y2022.month01.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindTheTownJudgeTest {

    FindTheTownJudge ftj = new FindTheTownJudge();
    
    @Test
    public void findTheTownJudge01Test() {
        int n01 = 2;
        int[][] trust01 = {{1,2}};
        assertEquals(2, ftj.findJudge(n01, trust01));

        int n02 = 3;
        int[][] trust02 = {{1,3},{2,3}};
        assertEquals(3, ftj.findJudge(n02, trust02));

        int n03 = 3;
        int[][] trust03 = {{1,3},{2,3},{3,1}};
        assertEquals(-1, ftj.findJudge(n03, trust03));
    }
}