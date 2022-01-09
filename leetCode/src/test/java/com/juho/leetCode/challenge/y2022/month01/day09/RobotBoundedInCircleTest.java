package com.juho.leetCode.challenge.y2022.month01.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RobotBoundedInCircleTest {

    RobotBoundedInCircle rbc = new RobotBoundedInCircle();

    @Test
    public void robotBoundedInCircle01Test() {
        String instructions01 = "GGLLGG";
        assertEquals(true, rbc.isRobotBounded(instructions01));

        String instructions02 = "GG";
        assertEquals(false, rbc.isRobotBounded(instructions02));

        String instructions03 = "GL";
        assertEquals(true, rbc.isRobotBounded(instructions03));
    }
}