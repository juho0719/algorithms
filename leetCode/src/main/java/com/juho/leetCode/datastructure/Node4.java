package com.juho.leetCode.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Node4 {
    public int val;
    public List<Node4> neighbors;
    public Node4() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node4(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }
    public Node4(int _val, ArrayList<Node4> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
