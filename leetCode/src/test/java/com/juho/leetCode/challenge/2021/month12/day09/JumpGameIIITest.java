package com.juho.leetCode.challenge.month12.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JumpGameIIITest {

    JumpGameIII jg3 = new JumpGameIII();

    @Test
    public void jumpGameIII01Test() {
        int[] arr01 = {4,2,3,0,3,1,2};
        int start01 = 5;
        assertEquals(true, jg3.canReach(arr01, start01));

        int[] arr02 = {4,2,3,0,3,1,2};
        int start02 = 0;
        assertEquals(true, jg3.canReach(arr02, start02));

        int[] arr03 = {3,0,2,1,2};
        int start03 = 2;
        assertEquals(false, jg3.canReach(arr03, start03));
    }
}