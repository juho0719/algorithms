package com.juho.leetCode.challenge.y2022.month01.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JumpGameIVTest {
    
    JumpGameIV jg4 = new JumpGameIV();

    @Test
    public void jumpGameIV01Test() {
        int[] arr01 = {100,-23,-23,404,100,23,23,23,3,404};
        assertEquals(3, jg4.minJumps(arr01));
    }
}