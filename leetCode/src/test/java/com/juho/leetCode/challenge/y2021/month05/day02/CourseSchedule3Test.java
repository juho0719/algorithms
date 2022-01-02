package com.juho.leetCode.challenge.y2021.month05.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CourseSchedule3Test {

    CourseSchedule3 cs3 = new CourseSchedule3();

    @Test
    public void courseSchedule301Test() {
        int[][] courses01 = {{100,200}, {200,1300}, {1000,1250}, {2000,3200}};
        assertEquals(3, cs3.scheduleCourse(courses01));

        int[][] courses02 = {{1,2}};
        assertEquals(1, cs3.scheduleCourse(courses02));

        int[][] courses03 = {{3,2}, {4,3}};
        assertEquals(0, cs3.scheduleCourse(courses03));
    }

}
