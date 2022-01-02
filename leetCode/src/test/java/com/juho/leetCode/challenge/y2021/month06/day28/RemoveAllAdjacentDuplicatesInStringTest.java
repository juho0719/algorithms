package com.juho.leetCode.challenge.y2021.month06.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveAllAdjacentDuplicatesInStringTest {

    RemoveAllAdjacentDuplicatesInString raads = new RemoveAllAdjacentDuplicatesInString();

    @Test
    public void removeAllAdjacentDuplicatesInString01Test() {
        String s01 = "abbaca";
        assertEquals("ca", raads.removeDuplicates(s01));

        String s02 = "azxxzy";
        assertEquals("ay", raads.removeDuplicates(s02));
    }

}
