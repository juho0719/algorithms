package com.juho.leetCode.challenge.month09.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ExpressionAddOperatorsTest {

    ExpressionAddOperators eao = new ExpressionAddOperators();

    @Test
    public void expressionAddOperators01Test() {
        String num01 = "123";
        int target01 = 6;
        List<String> result01 = new ArrayList<>();
        result01.add("1+2+3");
        result01.add("1*2*3");
        assertEquals(result01, eao.addOperators(num01, target01));

        String num02 = "232";
        int target02 = 8;
        List<String> result02 = new ArrayList<>();
        result02.add("2+3*2");
        result02.add("2*3+2");
        assertEquals(result02, eao.addOperators(num02, target02));

        String num03 = "105";
        int target03 = 5;
        List<String> result03 = new ArrayList<>();
        result03.add("10-5");
        result03.add("1*0+5");
        assertEquals(result03, eao.addOperators(num03, target03));
    }
}