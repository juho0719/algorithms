package com.juho.leetCode.datastructure;

import java.util.Set;

public class Node {
    public Set<Integer> made, todo;
    public Node(Set<Integer> m, Set<Integer> t) {
        made = m;
        todo = t;
    }
}
