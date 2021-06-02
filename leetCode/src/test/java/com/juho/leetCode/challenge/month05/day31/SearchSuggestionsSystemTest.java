package com.juho.leetCode.challenge.month05.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SearchSuggestionsSystemTest {
    
    SearchSuggestionsSystem sss = new SearchSuggestionsSystem();

    @Test
    public void searchSuggestionsSystem01Test() {
        String[] products01 = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord01 = "mouse";
        List<List<String>> result01 = new ArrayList<>();
        List<String> result01Children01 = new ArrayList<>();
        result01Children01.add("mobile");
        result01Children01.add("moneypot");
        result01Children01.add("monitor");
        result01.add(result01Children01);
        List<String> result01Children02 = new ArrayList<>();
        result01Children02.add("mobile");
        result01Children02.add("moneypot");
        result01Children02.add("monitor");
        result01.add(result01Children02);
        List<String> result01Children03 = new ArrayList<>();
        result01Children03.add("mouse");
        result01Children03.add("mousepad");
        result01.add(result01Children03);
        List<String> result01Children04 = new ArrayList<>();
        result01Children04.add("mouse");
        result01Children04.add("mousepad");
        result01.add(result01Children04);
        List<String> result01Children05 = new ArrayList<>();
        result01Children05.add("mouse");
        result01Children05.add("mousepad");
        result01.add(result01Children05);
        assertEquals(result01, sss.suggestedProducts(products01, searchWord01));

        String[] products02 = {"bags","baggage","banner","box","cloths"};
        String searchWord02 = "bags";
        List<List<String>> result02 = new ArrayList<>();
        List<String> result02Children01 = new ArrayList<>();
        result02Children01.add("baggage");
        result02Children01.add("bags");
        result02Children01.add("banner");
        result02.add(result02Children01);
        List<String> result02Children02 = new ArrayList<>();
        result02Children02.add("baggage");
        result02Children02.add("bags");
        result02Children02.add("banner");
        result02.add(result02Children02);
        List<String> result02Children03 = new ArrayList<>();
        result02Children03.add("baggage");
        result02Children03.add("bags");
        result02.add(result02Children03);
        List<String> result02Children04 = new ArrayList<>();
        result02Children04.add("bags");
        result02.add(result02Children04);
        assertEquals(result02, sss.suggestedProducts(products02, searchWord02));
    }
}