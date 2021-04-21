package com.juho.leetCode.datastructure;

import java.util.List;

public class ChildrenNode {
    public int val;
    public List<ChildrenNode> children;

    public ChildrenNode() {}

    public ChildrenNode(int _val) {
        val = _val;
    }

    public ChildrenNode(int _val, List<ChildrenNode> _children) {
        val = _val;
        children = _children;
    }
}
