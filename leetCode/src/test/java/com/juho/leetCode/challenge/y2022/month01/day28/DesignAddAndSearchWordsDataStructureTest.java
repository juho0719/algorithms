package com.juho.leetCode.challenge.y2022.month01.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DesignAddAndSearchWordsDataStructureTest {

    @Test
    public void designAddAndSearchWordsDataStructure01Test() {
        DesignAddAndSearchWordsDataStructure dasw = new DesignAddAndSearchWordsDataStructure();
        dasw.addWord("bad");
        dasw.addWord("dad");
        dasw.addWord("mad");

        assertEquals(false, dasw.search("pad"));
        assertEquals(true, dasw.search("bad"));
        assertEquals(true, dasw.search(".ad"));
        assertEquals(true, dasw.search("b.."));
    }
}