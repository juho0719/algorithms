package com.juho.leetCode.challenge.y2021.month03.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class KeysAndRoomsTest {
    
    KeysAndRooms kr = new KeysAndRooms();

    @Test
    public void wiggleSubsequence01Test() {
        List<List<Integer>> rooms01 = new ArrayList<>();
        List<Integer> rooms01Sub01 = new ArrayList<>();
        List<Integer> rooms01Sub02 = new ArrayList<>();
        List<Integer> rooms01Sub03 = new ArrayList<>();
        List<Integer> rooms01Sub04 = new ArrayList<>();
        rooms01Sub01.add(1);
        rooms01Sub02.add(2);
        rooms01Sub03.add(3);
        rooms01.add(rooms01Sub01);
        rooms01.add(rooms01Sub02);
        rooms01.add(rooms01Sub03);
        rooms01.add(rooms01Sub04);
        assertEquals(true, kr.canVisitAllRooms(rooms01));
    }
}
