package com.juho.leetCode.aprilLeetCodingChallenge.day24;


import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CriticalConnectionsInaNetworkTest {

    CriticalConnectionsInaNetwork ccn = new CriticalConnectionsInaNetwork();

    @Test
    public void criticalConnectionsInaNetwork01Test() {
        int n01 = 4;
        List<List<Integer>> connections101 = new ArrayList<>();
        List<Integer> connection101 = new ArrayList<>();
        connection101.add(0);
        connection101.add(1);
        connections101.add(connection101);
        List<Integer> connection102 = new ArrayList<>();
        connection102.add(1);
        connection102.add(2);
        connections101.add(connection102);
        List<Integer> connection103 = new ArrayList<>();
        connection103.add(2);
        connection103.add(0);
        connections101.add(connection103);
        List<Integer> connection104 = new ArrayList<>();
        connection104.add(1);
        connection104.add(3);
        connections101.add(connection104);
        
        List<List<Integer>> results101 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(1);
        result101.add(3);
        results101.add(result101);
        assertEquals(results101, ccn.criticalConnections(n01, connections101));

    }
}
