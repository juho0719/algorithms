package com.juho.leetCode.challenge.y2022.month04.day30;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class EvaluateDivisionTest {

    EvaluateDivision ed = new EvaluateDivision();

    @Test
    public void evaluateDivision01Test() {
        List<List<String>> equations100 = new ArrayList<>();
        List<String> equations101 = new ArrayList<>();
        equations101.add("a");
        equations101.add("b");
        equations100.add(equations101);
        List<String> equations102 = new ArrayList<>();
        equations102.add("b");
        equations102.add("c");
        equations100.add(equations102);
        
        double[] values01 = {2.0, 3.0};

        List<List<String>> queries100 = new ArrayList<>();
        List<String> queries101 = new ArrayList<>();
        queries101.add("a");
        queries101.add("c");
        queries100.add(queries101);
        List<String> queries102 = new ArrayList<>();
        queries102.add("b");
        queries102.add("a");
        queries100.add(queries102);
        List<String> queries103 = new ArrayList<>();
        queries103.add("a");
        queries103.add("e");
        queries100.add(queries103);
        List<String> queries104 = new ArrayList<>();
        queries104.add("a");
        queries104.add("a");
        queries100.add(queries104);
        List<String> queries105 = new ArrayList<>();
        queries105.add("x");
        queries105.add("x");
        queries100.add(queries105);

        double[] result01 = {6.0, 0.5, -1.0, 1,0, -1.0};
        assertArrayEquals(result01, ed.calcEquation(equations100, values01, queries100));
    }
}