package com.juho.leetCode.challenge.month05.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindAndReplacePatternTest {

    FindAndReplacePattern frp = new FindAndReplacePattern();
    
    @Test
    public void findAndReplacePattern01Test() {
        String[] words01 = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        List<String> result01 = new ArrayList<>();
        result01.add("mee");
        result01.add("aqq");
        assertEquals(result01, frp.findAndReplacePattern(words01, "abb"));
        
        String[] words02 = {"a", "b", "c"};
        List<String> result02 = new ArrayList<>();
        result02.add("a");
        result02.add("b");
        result02.add("c");
        assertEquals(result02, frp.findAndReplacePattern(words02, "a"));
    }
}