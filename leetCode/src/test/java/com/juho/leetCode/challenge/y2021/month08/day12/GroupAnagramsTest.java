package com.juho.leetCode.challenge.y2021.month08.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {

    GroupAnagrams ga = new GroupAnagrams();

    @Test
    public void groupAnagrams01Test() {
        String[] strs01 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result100 = new ArrayList<>();
        List<String> result101 = new ArrayList<>();
        result101.add("bat");
        result100.add(result101);
        List<String> result102 = new ArrayList<>();
        result102.add("tan");
        result102.add("nat");
        result100.add(result102);
        List<String> result104 = new ArrayList<>();
        result104.add("eat");
        result104.add("tea");
        result104.add("ate");
        result100.add(result104);
        assertEquals(result100, ga.groupAnagrams(strs01));
    }
}
