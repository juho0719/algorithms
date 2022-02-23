package com.juho.leetCode.challenge.y2022.month02.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnNumberTest {

    ExcelSheetColumnNumber esc = new ExcelSheetColumnNumber();

    @Test
    public void excelSheetColumnNumber01Test() {
        String columnTitle01 = "A";
        assertEquals(1, esc.titleToNumber(columnTitle01));
        
        String columnTitle02 = "AB";
        assertEquals(28, esc.titleToNumber(columnTitle02));

        String columnTitle03 = "ZY";
        assertEquals(701, esc.titleToNumber(columnTitle03));
    }
}