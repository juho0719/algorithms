package com.juho.leetCode.challenge.month08.day26;

public class VerifyPreorderSerializationOfaBinaryTree {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int slots = 1;
        for(String node: nodes) {
            if (slots <= 0) return false;
            if (node.equals("#")) slots--;
            else slots++;
        }
        return slots == 0;
    }
}