package com.juho.leetCode.challenge.y2021.month04.day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.juho.leetCode.datastructure.NestedInteger;

public class FlattenNestedListIterator implements Iterator<Integer> {
    Queue<Integer> data = new LinkedList<>();

    public FlattenNestedListIterator(List<NestedInteger> nestedList) { 
        flatten(nestedList);
    }
    
    public void flatten(List<NestedInteger> list) {
        for (NestedInteger el : list)
            if (el.isInteger()) data.add(el.getInteger());
            else flatten(el.getList());
    }

    @Override
    public Integer next() {
        return data.poll();
    }

    @Override
    public boolean hasNext() {
        return data.size() > 0;
    }
}