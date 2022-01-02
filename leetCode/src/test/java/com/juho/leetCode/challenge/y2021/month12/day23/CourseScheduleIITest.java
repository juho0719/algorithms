package com.juho.leetCode.challenge.y2021.month12.day23;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class CourseScheduleIITest {

    CourseScheduleII cs2 = new CourseScheduleII();

    @Test
    public void courseScheduleII01Test() {
        int numCourses01 = 2;
        int[][] prerequisites01 = {{1,0}};
        int[] result01 = {0,1};
        assertArrayEquals(result01, cs2.findOrder(numCourses01, prerequisites01));

        int numCourses02 = 4;
        int[][] prerequisites02 = {{1,0},{2,0},{3,1},{3,2}};
        int[] result02 = {0,1,2,3};
        assertArrayEquals(result02, cs2.findOrder(numCourses02, prerequisites02));

        int numCourses03 = 1;
        int[][] prerequisites03 = {};
        int[] result03 = {0};
        assertArrayEquals(result03, cs2.findOrder(numCourses03, prerequisites03));
    }
}