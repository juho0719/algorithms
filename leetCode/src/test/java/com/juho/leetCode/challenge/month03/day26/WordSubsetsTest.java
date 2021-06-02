package com.juho.leetCode.challenge.month03.day26;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class WordSubsetsTest {
    
    WordSubsets ws = new WordSubsets();

    @Test
    public void wordSubset01Test() {
        String[] A01 = {"amazon","apple","facebook","google","leetcode"};
        String[] B01 = {"e","o"};
        List<String> result01 = new ArrayList<>();
        result01.add("facebook");
        result01.add("google");
        result01.add("leetcode");
        assertArrayEquals(result01.toArray(), ws.wordSubsets(A01, B01).toArray()); 

        String[] A02 = {"amazon","apple","facebook","google","leetcode"};
        String[] B02 = {"l","e"};
        List<String> result02 = new ArrayList<>();
        result02.add("apple");
        result02.add("google");
        result02.add("leetcode");
        assertArrayEquals(result02.toArray(), ws.wordSubsets(A02, B02).toArray()); 

        String[] A03 = {"amazon","apple","facebook","google","leetcode"};
        String[] B03 = {"e","oo"};
        List<String> result03 = new ArrayList<>();
        result03.add("facebook");
        result03.add("google");
        assertArrayEquals(result03.toArray(), ws.wordSubsets(A03, B03).toArray()); 

        String[] A04 = {"amazon","apple","facebook","google","leetcode"};
        String[] B04 = {"lo","eo"};
        List<String> result04 = new ArrayList<>();
        result04.add("google");
        result04.add("leetcode");
        assertArrayEquals(result04.toArray(), ws.wordSubsets(A04, B04).toArray()); 

        String[] A05 = {"amazon","apple","facebook","google","leetcode"};
        String[] B05 = {"ec","oc","ceo"};
        List<String> result05 = new ArrayList<>();
        result05.add("facebook");
        result05.add("leetcode");
        assertArrayEquals(result05.toArray(), ws.wordSubsets(A05, B05).toArray()); 
    }
}
