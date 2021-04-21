package com.juho.leetCode.aprilLeetCodingChallenge.day20;

import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.ChildrenNode;

public class NaryTreePreorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(ChildrenNode root) {
        if (root == null) return ans;
        ans.add(root.val);
        if(root.children == null) return ans;
        for (ChildrenNode child : root.children)
            preorder(child);
        return ans;
    }
}