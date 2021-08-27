package com.juho.leetCode.challenge.month08.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VerifyPreorderSerializationOfaBinaryTreeTest {

    VerifyPreorderSerializationOfaBinaryTree vpsbt = new VerifyPreorderSerializationOfaBinaryTree();

    @Test
    public void verifyPreorderSerializationOfaBinaryTree01Test() {
        String preorder01 = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        assertEquals(true, vpsbt.isValidSerialization(preorder01));

        String preorder02 = "1,#";
        assertEquals(false, vpsbt.isValidSerialization(preorder02));

        String preorder03 = "9,#,#,1";
        assertEquals(false, vpsbt.isValidSerialization(preorder03));
    }
}