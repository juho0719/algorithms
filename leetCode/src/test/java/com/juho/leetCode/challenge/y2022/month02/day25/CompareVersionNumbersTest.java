package com.juho.leetCode.challenge.y2022.month02.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CompareVersionNumbersTest {

    CompareVersionNumbers cvn = new CompareVersionNumbers();

    @Test
    public void compareVersionNumbers01Test() {
        String version101 = "1.01";
        String version102 = "1.001";
        assertEquals(0, cvn.compareVersion(version101, version102));

        String version201 = "1.0";
        String version202 = "1.0.0";
        assertEquals(0, cvn.compareVersion(version201, version202));

        String version301 = "0.1";
        String version302 = "1.1";
        assertEquals(-1, cvn.compareVersion(version301, version302));
    }
}