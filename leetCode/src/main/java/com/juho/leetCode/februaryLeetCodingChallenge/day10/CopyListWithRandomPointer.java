package com.juho.leetCode.februaryLeetCodingChallenge.day10;

import java.util.HashMap;
import java.util.Map;

import com.juho.leetCode.datastructure.RandomNode;

public class CopyListWithRandomPointer {

    public RandomNode copyRandomList(RandomNode head) {

        Map<RandomNode, RandomNode> map = new HashMap<>();
        RandomNode ptr = head;
        
        while (ptr != null) {
            RandomNode node = new RandomNode (ptr.val);
            map.put (ptr, node);
            ptr = ptr.next;
        }
        
        for (RandomNode key : map.keySet ()) {
            RandomNode node = map.get (key);
            node.next = key.next == null ? null : map.get (key.next);
            node.random = key.random == null ? null : map.get (key.random);
        }
        
        return map.get (head);
    }
}
